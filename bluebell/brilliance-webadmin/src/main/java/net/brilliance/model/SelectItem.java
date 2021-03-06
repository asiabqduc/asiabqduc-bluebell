/**
 * 
 */
package net.brilliance.model;

import java.util.Map;

import net.brilliance.common.CommonConstants;

/**
 * @author ducbq
 *
 */
public class SelectItem {
	private Long id;
	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public SelectItem setCode(String code) {
		this.code = code;
		return this;
	}

	public SelectItem() {
	}

	public SelectItem(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public SelectItem(long id, String code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public SelectItem setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public SelectItem setName(String name) {
		this.name = name;
		return this;
	}

	public static SelectItem buildInstance(Long key, Map<String, Object> properties){
		SelectItem instance = new SelectItem();
		instance.setId(key);
		instance.setCode((String)properties.get(CommonConstants.PROPERTY_CODE));
		if (properties.containsKey(CommonConstants.PROPERTY_NAME)){
			instance.setName((String)properties.get(CommonConstants.PROPERTY_NAME));
		}
		return instance;
	}
}