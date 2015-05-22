/*
 * Copyright 2015 ICCS/NTUA 
 * Licensed under the Eclipse Public License(EPL) version 1.0 License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://www.eclipse.org/legal/epl-v10.html
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors: Athanasia Evangelinou
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *
 */

package eu.artist.migration.ct.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import eu.artist.migration.ct.common.IniReader;

public class DbConnection {
	private static volatile Connection connection = null;
	
	private static Connection createConnection() throws SQLException {
		IniReader reader = IniReader.getInstance();
		String connectionString = "jdbc:mysql://" + reader.getDbHost() +":" + reader.getDbPort() + "/" + reader.getDbName() +
				"?" + "user=" + reader.getDbUser() + "&password=" + reader.getDbPass();
		Connection connection = DriverManager.getConnection(connectionString);
		return connection;
	}
	
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			synchronized (DbConnection.class) {
				// Double check
				if (connection == null) {
					connection = createConnection();
				}
			}
		}
		return connection;
	}
}
