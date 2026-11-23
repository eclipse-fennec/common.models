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
 * A representation of the model object '<em><b>CIM iSCSI Session Failures</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Failure Statistics for Sessions associated with a iSCSI Node. An instance of this class will be associated by ElementStatisticalData to an instance of SCSIProtocolController representing an iSCSI Node. These statistics are associated to a Node since they describe the aggregated Session data for all failed Sessions associated to iSCSI protocol endpoints used by the Node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionFailures#getSessionFailures <em>Session Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionFailures#getLastSessionFailureType <em>Last Session Failure Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionFailures#getOtherLastSessionFailureType <em>Other Last Session Failure Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionFailures#getLastSessionFailureRemoteNodeName <em>Last Session Failure Remote Node Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionFailures#getSessionDigestFailures <em>Session Digest Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionFailures#getSessionConnectionTimeoutFailures <em>Session Connection Timeout Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionFailures#getSessionFormatErrors <em>Session Format Errors</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionFailures()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.11.0' UMLPackagePath='CIM::Network::iSCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSISessionFailures extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Session Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times a session belonging to this Network Entity has been failed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Failures</em>' attribute.
	 * @see #setSessionFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionFailures_SessionFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiInstSsnFailures\"]'"
	 * @generated
	 */
	Long getSessionFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionFailures#getSessionFailures <em>Session Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Failures</em>' attribute.
	 * @see #getSessionFailures()
	 * @generated
	 */
	void setSessionFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Last Session Failure Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the last session failure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Session Failure Type</em>' attribute.
	 * @see #setLastSessionFailureType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionFailures_LastSessionFailureType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Digest\",\"Timeout\",\"Format\"]' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiInstLastSsnFailureType\"]' ModelCorrespondence='[\"CIM_iSCSISessionFailures.OtherLastSessionFailureType\",\"CIM_iSCSISessionFailures.LastSessionFailureRemoteNodeName\"]'"
	 * @generated
	 */
	Integer getLastSessionFailureType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionFailures#getLastSessionFailureType <em>Last Session Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Session Failure Type</em>' attribute.
	 * @see #getLastSessionFailureType()
	 * @generated
	 */
	void setLastSessionFailureType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Last Session Failure Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of the last Session failure when LastSessionFailureType is equal to the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Last Session Failure Type</em>' attribute.
	 * @see #setOtherLastSessionFailureType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionFailures_OtherLastSessionFailureType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_iSCSISessionFailures.LastSessionFailureType\"]'"
	 * @generated
	 */
	String getOtherLastSessionFailureType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionFailures#getOtherLastSessionFailureType <em>Other Last Session Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Last Session Failure Type</em>' attribute.
	 * @see #getOtherLastSessionFailureType()
	 * @generated
	 */
	void setOtherLastSessionFailureType(String value);

	/**
	 * Returns the value of the '<em><b>Last Session Failure Remote Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The iSCSI name of the remote node from the failed session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Session Failure Remote Node Name</em>' attribute.
	 * @see #setLastSessionFailureRemoteNodeName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionFailures_LastSessionFailureRemoteNodeName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiInstLastSsnRmtNodeName\"]' ModelCorrespondence='[\"CIM_iSCSISessionFailures.LastSessionFailureType\"]'"
	 * @generated
	 */
	String getLastSessionFailureRemoteNodeName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionFailures#getLastSessionFailureRemoteNodeName <em>Last Session Failure Remote Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Session Failure Remote Node Name</em>' attribute.
	 * @see #getLastSessionFailureRemoteNodeName()
	 * @generated
	 */
	void setLastSessionFailureRemoteNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Session Digest Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of sessions which were failed due to receipt of a PDU containing header or data digest errors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Digest Failures</em>' attribute.
	 * @see #setSessionDigestFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionFailures_SessionDigestFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiInstSsnDigestErrors\"]'"
	 * @generated
	 */
	Long getSessionDigestFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionFailures#getSessionDigestFailures <em>Session Digest Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Digest Failures</em>' attribute.
	 * @see #getSessionDigestFailures()
	 * @generated
	 */
	void setSessionDigestFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Session Connection Timeout Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of sessions which were failed due to a sequence exceeding a time limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Connection Timeout Failures</em>' attribute.
	 * @see #setSessionConnectionTimeoutFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionFailures_SessionConnectionTimeoutFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiInstSsnCxnTimeoutErrors\"]'"
	 * @generated
	 */
	Long getSessionConnectionTimeoutFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionFailures#getSessionConnectionTimeoutFailures <em>Session Connection Timeout Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Connection Timeout Failures</em>' attribute.
	 * @see #getSessionConnectionTimeoutFailures()
	 * @generated
	 */
	void setSessionConnectionTimeoutFailures(Long value);

	/**
	 * Returns the value of the '<em><b>Session Format Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of sessions which were failed due to receipt of a PDU which contained a format error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Format Errors</em>' attribute.
	 * @see #setSessionFormatErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionFailures_SessionFormatErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiInstSsnFormatErrors\"]'"
	 * @generated
	 */
	Long getSessionFormatErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionFailures#getSessionFormatErrors <em>Session Format Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Format Errors</em>' attribute.
	 * @see #getSessionFormatErrors()
	 * @generated
	 */
	void setSessionFormatErrors(Long value);

} // CIM_iSCSISessionFailures
