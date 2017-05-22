/**
 * Copyright (C) 2016 Czech Technical University in Prague
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 * details. You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package cz.cvut.kbss.jsonld;

/**
 * JSON-LD constants.
 */
public class JsonLd {

    /**
     * JSON-LD {@code @list} keyword.
     */
    public static final String LIST = "@list";

    /**
     * JSON-LD {@code @id} keyword.
     */
    public static final String ID = "@id";

    /**
     * JSON-LD {@code @type} keyword.
     */
    public static final String TYPE = "@type";

    /**
     * JSON-LD {@code @value} keyword.
     */
    public static final String VALUE = "@value";

    /**
     * JSON-LD media type.
     */
    public static final String MEDIA_TYPE = "application/ld+json";

    private JsonLd() {
        throw new AssertionError();
    }
}