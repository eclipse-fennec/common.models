/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM iSCSI Login Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Statistics for Logins and Logouts to or from an iSCSI Node. An instance of this class will be associated by ElementStatisticalData to an instance of SCSIProtocolController that represents the Node. The Node can be either an Initiator or Target and so the interpretation of the properties in this class varies accordingly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLoginFailures <em>Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureTime <em>Last Login Failure Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureType <em>Last Login Failure Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getOtherLastLoginFailureType <em>Other Last Login Failure Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureRemoteNodeName <em>Last Login Failure Remote Node Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureRemoteAddressType <em>Last Login Failure Remote Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureRemoteAddress <em>Last Login Failure Remote Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getSuccessfulLogins <em>Successful Logins</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getNegotiationLoginFailures <em>Negotiation Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getAuthenticationLoginFailures <em>Authentication Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getAuthorizationLoginFailures <em>Authorization Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLoginRedirects <em>Login Redirects</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getOtherLoginFailures <em>Other Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getNormalLogouts <em>Normal Logouts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getOtherLogouts <em>Other Logouts</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.11.0' UMLPackagePath='CIM::Network::iSCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSILoginStatistics extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Login Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property counts the number of times a login attempt from this node(initiator) or to this node(target) has failed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login Failures</em>' attribute.
	 * @see #setLoginFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_LoginFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLoginFailures\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLoginFailures\"]'"
	 * @generated
	 */
	Long getLoginFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLoginFailures <em>Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Failures</em>' attribute.
	 * @see #getLoginFailures()
	 * @generated
	 */
	void setLoginFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Last Login Failure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timestamp of the most recent failure of a login attempt from this node(initiator) or to this node(target). A value of zero indicates that no such failures have occurred since the last system boot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Login Failure Time</em>' attribute.
	 * @see #setLastLoginFailureTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_LastLoginFailureTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLastFailureTime\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLastFailureTime\"]' ModelCorrespondence='[\"CIM_iSCSILoginStatistics.LastLoginFailureType\",\"CIM_iSCSILoginStatistics.LastLoginFailureRemoteNodeName\"]'"
	 * @generated
	 */
	String getLastLoginFailureTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureTime <em>Last Login Failure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Login Failure Time</em>' attribute.
	 * @see #getLastLoginFailureTime()
	 * @generated
	 */
	void setLastLoginFailureTime(String value);

	/**
	 * Returns the value of the '<em><b>Last Login Failure Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the most recent failure of a login attempt from this node(initiator) or to this node(target).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Login Failure Type</em>' attribute.
	 * @see #setLastLoginFailureType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_LastLoginFailureType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Negotiate\",\"Authenticate\",\"Authorize\",\"Redirect\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLastFailureType\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLastFailureType\"]' ModelCorrespondence='[\"CIM_iSCSILoginStatistics.OtherLastLoginFailureType\",\"CIM_iSCSILoginStatistics.LastLoginFailureTime\",\"CIM_iSCSILoginStatistics.LastLoginFailureRemoteNodeName\"]'"
	 * @generated
	 */
	Integer getLastLoginFailureType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureType <em>Last Login Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Login Failure Type</em>' attribute.
	 * @see #getLastLoginFailureType()
	 * @generated
	 */
	void setLastLoginFailureType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Last Login Failure Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of the last login failure when LastLoginFailureType is equal to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Last Login Failure Type</em>' attribute.
	 * @see #setOtherLastLoginFailureType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_OtherLastLoginFailureType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_iSCSILoginStatistics.LastLoginFailureType\"]'"
	 * @generated
	 */
	String getOtherLastLoginFailureType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getOtherLastLoginFailureType <em>Other Last Login Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Last Login Failure Type</em>' attribute.
	 * @see #getOtherLastLoginFailureType()
	 * @generated
	 */
	void setOtherLastLoginFailureType(String value);

	/**
	 * Returns the value of the '<em><b>Last Login Failure Remote Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The iSCSI name of the remote node that failed the last login attempt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Login Failure Remote Node Name</em>' attribute.
	 * @see #setLastLoginFailureRemoteNodeName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_LastLoginFailureRemoteNodeName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLastTgtFailureName\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLastIntrFailureName\"]' ModelCorrespondence='[\"CIM_iSCSILoginStatistics.LastLoginFailureTime\",\"CIM_iSCSILoginStatistics.LastLoginFailureType\",\"CIM_iSCSILoginStatistics.LastLoginFailureRemoteAddressType\",\"CIM_iSCSILoginStatistics.LastLoginFailureRemoteAddress\"]'"
	 * @generated
	 */
	String getLastLoginFailureRemoteNodeName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureRemoteNodeName <em>Last Login Failure Remote Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Login Failure Remote Node Name</em>' attribute.
	 * @see #getLastLoginFailureRemoteNodeName()
	 * @generated
	 */
	void setLastLoginFailureRemoteNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Last Login Failure Remote Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of Internet Network Address of the remote node that failed the last login attempt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Login Failure Remote Address Type</em>' attribute.
	 * @see #setLastLoginFailureRemoteAddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_LastLoginFailureRemoteAddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"IPv4\",\"IPv6\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLastTgtFailureAddrType\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLastIntrFailureAddrType\"]' ModelCorrespondence='[\"CIM_iSCSILoginStatistics.LastLoginFailureRemoteNodeName\",\"CIM_iSCSILoginStatistics.LastLoginFailureRemoteAddress\"]'"
	 * @generated
	 */
	Integer getLastLoginFailureRemoteAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureRemoteAddressType <em>Last Login Failure Remote Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Login Failure Remote Address Type</em>' attribute.
	 * @see #getLastLoginFailureRemoteAddressType()
	 * @generated
	 */
	void setLastLoginFailureRemoteAddressType(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Login Failure Remote Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Internet Network Address giving the host address of the remote node that failed the last login attempt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Login Failure Remote Address</em>' attribute.
	 * @see #setLastLoginFailureRemoteAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_LastLoginFailureRemoteAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLastTgtFailureAddr\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLastIntrFailureAddr\"]' ModelCorrespondence='[\"CIM_iSCSILoginStatistics.LastLoginFailureRemoteNodeName\",\"CIM_iSCSILoginStatistics.LastLoginFailureRemoteAddressType\"]'"
	 * @generated
	 */
	Long getLastLoginFailureRemoteAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLastLoginFailureRemoteAddress <em>Last Login Failure Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Login Failure Remote Address</em>' attribute.
	 * @see #getLastLoginFailureRemoteAddress()
	 * @generated
	 */
	void setLastLoginFailureRemoteAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Successful Logins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of Login Response PDUs with status 0x0000, Accept Login, received by this node(initator), or transmitted by this node (target).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Successful Logins</em>' attribute.
	 * @see #setSuccessfulLogins(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_SuccessfulLogins()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLoginAcceptRsps\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLoginAccepts\"]'"
	 * @generated
	 */
	Long getSuccessfulLogins();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getSuccessfulLogins <em>Successful Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successful Logins</em>' attribute.
	 * @see #getSuccessfulLogins()
	 * @generated
	 */
	void setSuccessfulLogins(Long value);

	/**
	 * Returns the value of the '<em><b>Negotiation Login Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the node is an initiator this property is the number of times it has aborted a login because parameter negotiation with the target failed. 
	 * If the node is a target the property is the number of times a it has effectively refused a login because the parameter negotiation failed. While this situation can occur, the exact mechanism is as yet undefined in the iSCSI Protocol Spec.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negotiation Login Failures</em>' attribute.
	 * @see #setNegotiationLoginFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_NegotiationLoginFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLoginNegotiateFails\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLoginNegotiateFails\"]'"
	 * @generated
	 */
	Long getNegotiationLoginFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getNegotiationLoginFailures <em>Negotiation Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiation Login Failures</em>' attribute.
	 * @see #getNegotiationLoginFailures()
	 * @generated
	 */
	void setNegotiationLoginFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Authentication Login Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the node is an initiator this property is the number of times it has aborted a login because the target could not be authenticated. If the node is a target this property is the count of Login Response PDUs with status 0x0201, Authentication Failed, transmitted by this target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Login Failures</em>' attribute.
	 * @see #setAuthenticationLoginFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_AuthenticationLoginFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLoginAuthenticateFails\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLoginAuthenticateFails\"]'"
	 * @generated
	 */
	Long getAuthenticationLoginFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getAuthenticationLoginFailures <em>Authentication Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Login Failures</em>' attribute.
	 * @see #getAuthenticationLoginFailures()
	 * @generated
	 */
	void setAuthenticationLoginFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Authorization Login Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the node is an initiator this property is the count of Login Response PDUs with status class 0x201, 'Authentication Failed', received by this initiator. If the node is a target the property is the count of Login Response PDUs with status 0x0202, 'Forbidden Target', transmitted by this target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization Login Failures</em>' attribute.
	 * @see #setAuthorizationLoginFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_AuthorizationLoginFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLoginAuthFailRsps\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLoginAuthorizeFails\"]'"
	 * @generated
	 */
	Long getAuthorizationLoginFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getAuthorizationLoginFailures <em>Authorization Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Login Failures</em>' attribute.
	 * @see #getAuthorizationLoginFailures()
	 * @generated
	 */
	void setAuthorizationLoginFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Login Redirects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of Login Response PDUs with status class 0x01, Redirection, received by this node(initiator) or transmitted by this node(target).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login Redirects</em>' attribute.
	 * @see #setLoginRedirects(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_LoginRedirects()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLoginRedirectRsps\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLoginRedirects\"]'"
	 * @generated
	 */
	Long getLoginRedirects();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getLoginRedirects <em>Login Redirects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Redirects</em>' attribute.
	 * @see #getLoginRedirects()
	 * @generated
	 */
	void setLoginRedirects(Long value);

	/**
	 * Returns the value of the '<em><b>Other Login Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of failure Login Response PDUs which were received by this node(initiator) or were transmitted by this node(target), and which were not counted by any other property in this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Login Failures</em>' attribute.
	 * @see #setOtherLoginFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_OtherLoginFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLoginOtherFailRsps\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLoginOtherFails\"]'"
	 * @generated
	 */
	Long getOtherLoginFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getOtherLoginFailures <em>Other Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Login Failures</em>' attribute.
	 * @see #getOtherLoginFailures()
	 * @generated
	 */
	void setOtherLoginFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Normal Logouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of Logout Command PDUs generated by this node (initiator) or received by this node(target), with reason code 0 (closes the session).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal Logouts</em>' attribute.
	 * @see #setNormalLogouts(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_NormalLogouts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLogoutNormals\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLogoutNormals\"]'"
	 * @generated
	 */
	Long getNormalLogouts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getNormalLogouts <em>Normal Logouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Logouts</em>' attribute.
	 * @see #getNormalLogouts()
	 * @generated
	 */
	void setNormalLogouts(Long value);

	/**
	 * Returns the value of the '<em><b>Other Logouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of Logout Command PDUs generated by this node, (initiator) or received by this node(target), with any reason code other than 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Logouts</em>' attribute.
	 * @see #setOtherLogouts(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSILoginStatistics_OtherLogouts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiIntrLogoutOthers\",\"MIB.IETF|iSCSI-MIB.iscsiTgtLogoutOthers\"]'"
	 * @generated
	 */
	Long getOtherLogouts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSILoginStatistics#getOtherLogouts <em>Other Logouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Logouts</em>' attribute.
	 * @see #getOtherLogouts()
	 * @generated
	 */
	void setOtherLogouts(Long value);

} // CIM_iSCSILoginStatistics
