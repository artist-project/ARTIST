/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.common.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

public class CategoryNameTest {

	@Test
	public void testProjectName() {
		assertEquals("test", ProjectName.of("test").getName());
	}

	@Test
	public void testInstantiation() {
		assertEquals("test", new CompositeRepoName("test", ".").getName("/"));
		assertEquals("test", CategoryName.ofList(Lists.newArrayList("test"))
				.getName("/"));
	}

	@Test
	public void testDecomposePath() {
		assertEquals(Lists.newArrayList("123", "abc"),
				CategoryName.decomposeName("123.abc", "."));
		assertEquals(Lists.newArrayList("123", "abc"),
				CategoryName.decomposeName("123/abc", "/"));
		assertEquals(Lists.newArrayList("123", "abc"),
				CategoryName.decomposeName("/123/abc/", "/"));
		assertEquals(new ArrayList<String>(),
				CategoryName.decomposeName("....", "."));
	}

	@Test
	public void testComposePath() {
		assertEquals("123.abc",
				CategoryName.composeName(Lists.newArrayList("123", "abc"), "."));
		assertEquals("123/abc",
				CategoryName.composeName(Lists.newArrayList("123", "abc"), "/"));
		assertEquals("123.abc", CategoryName.composeName(
				Lists.newArrayList("123", "abc", ""), "."));
		assertEquals("123.abc", CategoryName.composeName(
				Lists.newArrayList("123", "", "abc"), "."));
		assertEquals("123.abc", CategoryName.composeName(
				Lists.newArrayList("123", "abc", null), "."));
	}

	private boolean isValid(String segment) {
		try {
			CategoryName.of(segment);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	private boolean isValid(List<String> segments) {
		try {
			CategoryName.ofList(segments);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Test
	public void testIsValidSegment() {
		assertTrue(isValid("asd123"));
		assertTrue(isValid("123asd"));
		assertTrue(isValid("123-asd"));
		assertTrue(isValid("123_asd"));
		assertTrue(isValid("_123asd-"));
		assertFalse(isValid("123!asd"));
		assertTrue(isValid("123.asd"));
		assertFalse(isValid("123:asd"));
		assertFalse(isValid("123asd "));
		assertFalse(isValid("123 asd"));
		assertFalse(isValid(" 123asd"));
		assertTrue(isValid(""));
	}

	@Test
	public void testIsValidPath() {
		assertTrue(isValid(new ArrayList<String>()));
		assertTrue(isValid(Lists.newArrayList("asd123")));
		assertTrue(isValid(Lists.newArrayList("a-sd", "1_23")));
		assertTrue(isValid(Lists.newArrayList("asd.", "123")));
		assertTrue(isValid(Lists.newArrayList("asd", ".123")));
	}

	@Test
	public void testFromCategoryPath() {
		assertEquals(Lists.newArrayList("123_abc"), CategoryName.of(".123_abc")
				.getSegments());

		assertEquals(CategoryName.ofList(Lists.newArrayList("123", "abc")),
				CategoryName.of("123.abc"));
		assertEquals(CategoryName.ofList(Lists.newArrayList("123_abc")),
				CategoryName.of("123_abc"));
		assertEquals(CategoryName.of("123_abc"), CategoryName.of(".123_abc"));
		assertEquals(CategoryName.ofList(Lists.newArrayList("123_abc")),
				CategoryName.of(".123_abc"));
	}

	@Test
	public void testFromURLFragement() {
		assertEquals(CategoryName.ofList(Lists.newArrayList("123", "abc")),
				CategoryName.ofUri("123/abc"));
		assertEquals(CategoryName.ofList(Lists.newArrayList("123_abc")),
				CategoryName.ofUri("123_abc"));
		assertEquals(CategoryName.ofList(Lists.newArrayList("123_abc")),
				CategoryName.ofUri("/123_abc"));
	}

	@Test
	public void testFromList() {
		assertEquals(CategoryName.ofUri("123/abc/_"),
				CategoryName.ofList(Lists.newArrayList("123", "abc", "_")));
	}

	@Test
	public void testAsCategoryPath() {
		assertEquals("123.ABC._",
				CategoryName
						.ofList(Lists.newArrayList(null, "123", "ABC", "_"))
						.getName());
	}

	@Test
	public void testAsURLFragement() {
		assertEquals("123/ABC/_",
				CategoryName.ofList(Lists.newArrayList("123", "ABC", "_", ""))
						.asUri());
	}

	@Test
	public void testGetSegments() {
		assertEquals(Lists.newArrayList("123", "ABC", "_"),
				CategoryName.of(".123.ABC._").getSegments());
	}

	@Test
	public void testGetParentPath() {
		assertEquals(CategoryName.of("123.ABC"), CategoryName.of("123.ABC._")
				.getParent());
		assertEquals(CategoryName.of("123"), CategoryName.of("123.ABC")
				.getParent());
		assertEquals(CategoryName.emptyName(), CategoryName.of("123")
				.getParent());
	}
}
