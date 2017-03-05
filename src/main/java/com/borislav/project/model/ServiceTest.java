package com.borislav.project.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ServiceTest {
	private String name;
	private long time;
	private float priceMin;
	private float priceMax = -1.0F;
	private String servInfo;

	public ServiceTest() {
		super();
	}

	public ServiceTest(String name, long time, float priceMin, String servInfo) {
		this.name = name;
		this.time = time;
		this.priceMin = priceMin;
		this.servInfo = servInfo;
	}

	public ServiceTest(String name, long time, float priceMin, float priceMax, String servInfo) {
		this.name = name;
		this.time = time;
		this.priceMin = priceMin;
		this.priceMax = priceMax;
		this.servInfo = servInfo;
	}

	public ServiceTest(String name, long time, float priceMin, float priceMax) {
		this.name = name;
		this.time = time;
		this.priceMin = priceMin;
		this.priceMax = priceMax;
	}

	public ServiceTest(String name, long time, float priceMin) {
		this.name = name;
		this.time = time;
		this.priceMin = priceMin;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return this.time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public float getPriceMin() {
		return this.priceMin;
	}

	public void setPriceMin(float priceMin) {
		this.priceMin = priceMin;
	}

	public float getPriceMax() {
		return this.priceMax;
	}

	public void setPriceMax(float priceMax) {
		this.priceMax = priceMax;
	}

	public String getServInfo() {
		return this.servInfo;
	}

	public void setServInfo(String servInfo) {
		this.servInfo = servInfo;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if ((o == null) || (getClass() != o.getClass())) {
			return false;
		}
		ServiceTest service = (ServiceTest) o;
		if (this.time != service.time) {
			return false;
		}
		if (Float.compare(service.priceMin, this.priceMin) != 0) {
			return false;
		}
		return service.name == null ? true : this.name != null ? this.name.equals(service.name) : false;
	}

	public int hashCode() {
		int result = this.name != null ? this.name.hashCode() : 0;
		result = 31 * result + (int) (this.time ^ this.time >>> 32);
		result = 31 * result + (this.priceMin != 0.0F ? Float.floatToIntBits(this.priceMin) : 0);
		return result;
	}
}
