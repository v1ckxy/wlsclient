/**
 * This file is part of Wlsagent.
 *
 * Wlsagent is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Wlsagent is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Wlsagent. If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package centreon.monitor.jmx.core;

/**
 * @author Yann Lambret
 * @author Kiril Dunn
 * 
 */
public enum Status {

    OK       ( 0 ),
    WARNING  ( 1 ),
    CRITICAL ( 2 ),
    UNKNOWN  ( 3 );

    private final int code;

    private Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
