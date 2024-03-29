package com.myspace.has;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class quoteBO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "agreementId")
	private java.lang.String agreementId;
	@org.kie.api.definition.type.Label(value = "dueDate")
	private java.lang.String dueDate;
	@org.kie.api.definition.type.Label(value = "leadDetails")
	private java.lang.String leadDetails;
	@org.kie.api.definition.type.Label(value = "notificationDate")
	private java.lang.String notificationDate;
	@org.kie.api.definition.type.Label(value = "parentId")
	private java.lang.String parentId;
	@org.kie.api.definition.type.Label(value = "partyId")
	private java.lang.String partyId;
	@org.kie.api.definition.type.Label(value = "personId")
	private java.lang.String personId;
	@org.kie.api.definition.type.Label(value = "processInstanceId")
	private java.lang.Long processInstanceId;
	@org.kie.api.definition.type.Label(value = "productSpecificationId")
	private java.lang.String productSpecificationId;
	@org.kie.api.definition.type.Label(value = "quoteDetails")
	private java.lang.String quoteDetails;
	@org.kie.api.definition.type.Label(value = "quoteNumber")
	private java.lang.String quoteNumber;
	@org.kie.api.definition.type.Label(value = "tabInformation")
	private java.util.List<java.lang.String> tabInformation;
	@org.kie.api.definition.type.Label(value = "userDetails")
	private java.lang.String userDetails;

	public quoteBO() {
	}

	public java.lang.String getAgreementId() {
		return this.agreementId;
	}

	public void setAgreementId(java.lang.String agreementId) {
		this.agreementId = agreementId;
	}

	public java.lang.String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(java.lang.String dueDate) {
		this.dueDate = dueDate;
	}

	public java.lang.String getLeadDetails() {
		return this.leadDetails;
	}

	public void setLeadDetails(java.lang.String leadDetails) {
		this.leadDetails = leadDetails;
	}

	public java.lang.String getNotificationDate() {
		return this.notificationDate;
	}

	public void setNotificationDate(java.lang.String notificationDate) {
		this.notificationDate = notificationDate;
	}

	public java.lang.String getParentId() {
		return this.parentId;
	}

	public void setParentId(java.lang.String parentId) {
		this.parentId = parentId;
	}

	public java.lang.String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(java.lang.String partyId) {
		this.partyId = partyId;
	}

	public java.lang.String getPersonId() {
		return this.personId;
	}

	public void setPersonId(java.lang.String personId) {
		this.personId = personId;
	}

	public java.lang.Long getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(java.lang.Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public java.lang.String getProductSpecificationId() {
		return this.productSpecificationId;
	}

	public void setProductSpecificationId(
			java.lang.String productSpecificationId) {
		this.productSpecificationId = productSpecificationId;
	}

	public java.lang.String getQuoteDetails() {
		return this.quoteDetails;
	}

	public void setQuoteDetails(java.lang.String quoteDetails) {
		this.quoteDetails = quoteDetails;
	}

	public java.lang.String getQuoteNumber() {
		return this.quoteNumber;
	}

	public void setQuoteNumber(java.lang.String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}

	public java.util.List<java.lang.String> getTabInformation() {
		return this.tabInformation;
	}

	public void setTabInformation(
			java.util.List<java.lang.String> tabInformation) {
		this.tabInformation = tabInformation;
	}

	public java.lang.String getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(java.lang.String userDetails) {
		this.userDetails = userDetails;
	}

	public quoteBO(java.lang.String agreementId, java.lang.String dueDate,
			java.lang.String leadDetails, java.lang.String notificationDate,
			java.lang.String parentId, java.lang.String partyId,
			java.lang.String personId, java.lang.Long processInstanceId,
			java.lang.String productSpecificationId,
			java.lang.String quoteDetails, java.lang.String quoteNumber,
			java.util.List<java.lang.String> tabInformation,
			java.lang.String userDetails) {
		this.agreementId = agreementId;
		this.dueDate = dueDate;
		this.leadDetails = leadDetails;
		this.notificationDate = notificationDate;
		this.parentId = parentId;
		this.partyId = partyId;
		this.personId = personId;
		this.processInstanceId = processInstanceId;
		this.productSpecificationId = productSpecificationId;
		this.quoteDetails = quoteDetails;
		this.quoteNumber = quoteNumber;
		this.tabInformation = tabInformation;
		this.userDetails = userDetails;
	}

}