package com.hb.base;

public enum Resources {

	LoginResourcePath("rest/auth/1/session"), CreateComResourcePath("/rest/api/2/issue/{IssueID}/comment"),
	UpdateComResourcePath("/rest/api/2/issue/{issueId}/comment/{commentId}"),
	deleteComResourcePath("/rest/api/2/issue/{issueId}/comment/{commentId}"),
	uploadAttachmentPath("/rest/api/2/issue/{issueId}/attachments");

	private String resourcePath;

	Resources(String resourcePath) {

		this.resourcePath = resourcePath;

	}

	public String getResourcePath() {
		return resourcePath;
	}

}
