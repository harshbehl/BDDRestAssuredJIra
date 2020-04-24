package com.hb.Payload;

public class CreateComParentPojo {

	private CreateComChildPojo visibility;
	private String body;

	public CreateComChildPojo getvisibility() {
		return visibility;
	}

	public void setVisble(CreateComChildPojo visibility) {
		this.visibility = visibility;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
