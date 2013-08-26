/*
 * Copyright 2001-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the ";License&quot;);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS"; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package utils;

/**
 * 
 * 네이밍 변환 관련 유틸 클래스
 * <p>
 * <b>NOTE:</b> 네이밍 변환 관련 유틸 클래스
 * 
 * @author 개발환경 개발팀 이흥주
 * @since 2009.08.03
 * @version 1.0
 * @see
 * 
 *      <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.08.03  이흥주          최초 생성
 * 
 * </pre>
 */
public class NamingUtils {
	/**
	 * Camelcase 이름 변경
	 * 
	 * @param name
	 * @return
	 */
	public static String convertUnderscoreNameToCamelcase(String name) {
		StringBuffer result = new StringBuffer();
		boolean nextIsUpper = false;
		if (name != null && name.length() > 0) {
			if (name.length() > 1 && name.substring(1, 2).equals("_")) {
				result.append(name.substring(0, 1).toUpperCase());
			} else {
				result.append(name.substring(0, 1).toLowerCase());
			}
			for (int i = 1; i < name.length(); i++) {
				String s = name.substring(i, i + 1);
				if (s.equals("_")) {
					nextIsUpper = true;
				} else {
					if (nextIsUpper) {
						result.append(s.toUpperCase());
						nextIsUpper = false;
					} else {
						result.append(s.toLowerCase());
					}
				}
			}
		}
		return result.toString();
	}

	/**
	 * Pascalcase 이름 변경
	 * 
	 * @param name
	 * @return
	 */
	public static String convertCamelcaseToPascalcase(String name) {
		StringBuffer result = new StringBuffer();
		result.append(name.substring(0, 1).toUpperCase());
		result.append(name.substring(1));
		return result.toString();
	}

	/**
	 * 첫글자 대문자
	 * 
	 * @param name
	 * @return
	 */
	public static String convertUppercaseFirstLetter(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append(name.substring(0, 1).toUpperCase());
		sb.append(name.substring(1).toLowerCase());
		return sb.toString();
	}
}
