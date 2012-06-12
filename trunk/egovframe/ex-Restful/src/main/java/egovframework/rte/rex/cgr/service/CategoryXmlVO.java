/*
 * Copyright 2011 MOPAS(Ministry of Public Administration and Security).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.rte.rex.cgr.service;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "categories")
public class CategoryXmlVO implements Serializable {

	private static final long serialVersionUID = -8123013251434188869L;

	private List<CategoryVO> categoriesVO;

	@XmlElement(name = "category")
	public List<CategoryVO> getCategoriesVO() {
		return categoriesVO;
	}

	public void setCategoriesVO(List<CategoryVO> categoriesVO) {
		this.categoriesVO = categoriesVO;
	}

}
