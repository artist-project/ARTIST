<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Copyright (c) 2005, 2007 IBM Corporation and others.
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the Eclipse Public License v1.0
    which accompanies this distribution, and is available at
    http://www.eclipse.org/legal/epl-v10.html
    Contributors:
    IBM Corporation - initial implementation
-->
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xalan="http://xml.apache.org/xalan"
	exclude-result-prefixes="xalan">
	
<xsl:output method="html" xalan:omit-meta-tag="yes" xalan:use-url-escaping="no"/>
	
<xsl:template match="/SearchResult">
	<xsl:variable name="initPageNum" select="@initPageNum"/>
	<xsl:variable name="maxPageNum" select="@maxPageNum"/>
	<xsl:variable name="nextEnabled" select="@nextEnabled"/>
	<xsl:variable name="prevEnabled" select="@prevEnabled"/>
	<xsl:variable name="nextText" select="@nextText"/>
	<xsl:variable name="prevText" select="@prevText"/>	
	<xsl:variable name="imagePath" select="@imagePath"/>
	<xsl:variable name="searchString" select="@searchString"/>	
	<xsl:variable name="nextHref" select="@nextHref"/>	
	<xsl:variable name="prevHref" select="@prevHref"/>	
	<xsl:variable name="icon" select="@icon"/>	

	<div class="searchResultPane">
		<table border="0" cellpadding="0" cellspacing="0" width="100%" >
			<tr align="top">
				<td align="right" nowrap="nowrap">
					(<b><xsl:value-of select="@initPageNum"/> - <xsl:value-of select="@maxPageNum"/></b><xsl:text> / </xsl:text><xsl:value-of select="@totalHits"/>)
					<xsl:choose>
						<xsl:when test="$prevEnabled = 'true'">
							<img onclick="javascript:getPrevNextPage('{$prevHref}'); return false;" onmouseover="style.cursor='pointer';" alt="{$prevText}" src="{$imagePath}previous.gif"/><xsl:text> </xsl:text>
						</xsl:when>
						<xsl:otherwise>
							<img onclick="" onmouseover="style.cursor='pointer';" alt="{$prevText}" src="{$imagePath}no_previous.gif"/><xsl:text> </xsl:text>
						</xsl:otherwise>
					</xsl:choose>
					<xsl:choose>
						<xsl:when test="$nextEnabled = 'true'">
							<img onclick="javascript:getPrevNextPage('{$nextHref}'); return false;" onmouseover="style.cursor='pointer';" alt="{$nextText}" src="{$imagePath}next.gif"/>
						</xsl:when>
						<xsl:otherwise>
							<img onclick="" onmouseover="style.cursor='pointer';" alt="{$nextText}" src="{$imagePath}no_next.gif"/><xsl:text> </xsl:text>
						</xsl:otherwise>
					</xsl:choose>
					&#160;	&#160;
				</td>			
			</tr>
		</table>	
	</div><br />
	<xsl:for-each select="SearchHit">
		<xsl:variable name="url" select="@url"/>
		<div class="searchHit">
			<table border="0" cellpadding="0" cellspacing="0" >
				<tr>
					<td align="right">
						<xsl:choose>
							<xsl:when test="@icon != ''">
								<img src="{$imagePath}{@icon}" alt=""/>
							</xsl:when>
							<xsl:otherwise>
								<img src="{$imagePath}searchrecord.gif" alt=""/>
							</xsl:otherwise>
						</xsl:choose>						
					</td>
					<td align="left">
						<a href="{$url}" target="ory_doc"><xsl:value-of select="@title"/></a>
					</td>
				</tr>
				<tr>
					<td align="right"></td>
					<td align="left"><xsl:value-of select="@summary"/></td>
				</tr>
			</table>
		</div>
	</xsl:for-each>
	<br/>
	<table border="0" cellpadding="0" cellspacing="0" width="100%">
		<tr valign="middle">
			<td align="right" nowrap="nowrap">				
				<xsl:choose>
					<xsl:when test="$prevEnabled = 'true'">
						<img onclick="javascript:getPrevNextPage('{$prevHref}'); return false;" onmouseover="style.cursor='pointer';" alt="{$prevText}" src="{$imagePath}previous.gif"/><xsl:text> </xsl:text>
					</xsl:when>
					<xsl:otherwise>
						<img onclick="" onmouseover="style.cursor='pointer';" alt="{$prevText}" src="{$imagePath}no_previous.gif"/><xsl:text> </xsl:text>
					</xsl:otherwise>
				</xsl:choose>
				<xsl:choose>
					<xsl:when test="$nextEnabled = 'true'">
						<img onclick="javascript:getPrevNextPage('{$nextHref}'); return false;" onmouseover="style.cursor='pointer';" alt="{$nextText}" src="{$imagePath}next.gif"/>
					</xsl:when>
					<xsl:otherwise>
						<img onclick="" onmouseover="style.cursor='pointer';" alt="{$nextText}" src="{$imagePath}no_next.gif"/><xsl:text> </xsl:text>
					</xsl:otherwise>
				</xsl:choose>
				&#160;	&#160;
			</td>	
		</tr>
	</table>    
</xsl:template>
</xsl:stylesheet>