package Learnings;

import io.restassured.mapper.ObjectMapper;

public class POJO {

	private String id; 
	private int version; 
	private String login; 
	private String passwordHash; 
	private String firstName; 
	private String lastName; 
	private String emailAddress; 
	private String imageUrl; 
	private boolean activated; 
	private String langKey; 
	private String role; 
	private String branchCode; 
	private String branchSetCode; 
	private String activationKey; 
	private String userType; 
	private String resetKey; 
	private String orgStrUid; 
	private String authorities; 
	private boolean resetPassword; 
	private boolean backendUser; 

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public String getLangKey() {
		return langKey;
	}
	public void setLangKey(String langKey) {
		this.langKey = langKey;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchSetCode() {
		return branchSetCode;
	}
	public void setBranchSetCode(String branchSetCode) {
		this.branchSetCode = branchSetCode;
	}
	public String getActivationKey() {
		return activationKey;
	}
	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getResetKey() {
		return resetKey;
	}
	public void setResetKey(String resetKey) {
		this.resetKey = resetKey;
	}
	public String getOrgStrUid() {
		return orgStrUid;
	}
	public void setOrgStrUid(String orgStrUid) {
		this.orgStrUid = orgStrUid;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	public boolean isResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	public boolean isBackendUser() {
		return backendUser;
	}
	public void setBackendUser(boolean backendUser) {
		this.backendUser = backendUser;
	}
	
	
	
	
}
