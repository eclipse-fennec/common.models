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
 * A representation of the model object '<em><b>CIM iSCSI Session Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Traffic and error statistics for an iSCSI Session. An instance of this class will be associated by ElementStatisticalData to the instance of iSCSISession.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getCommandPDUsTransferred <em>Command PD Us Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getResponsePDUsTransferred <em>Response PD Us Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getBytesTransmitted <em>Bytes Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getBytesReceived <em>Bytes Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getDigestErrors <em>Digest Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getConnectionTimeoutErrors <em>Connection Timeout Errors</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::iSCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSISessionStatistics extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Command PD Us Transferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of Command PDUs transferred on this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command PD Us Transferred</em>' attribute.
	 * @see #setCommandPDUsTransferred(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionStatistics_CommandPDUsTransferred()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnCmdPDUs\"]'"
	 * @generated
	 */
	Long getCommandPDUsTransferred();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getCommandPDUsTransferred <em>Command PD Us Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command PD Us Transferred</em>' attribute.
	 * @see #getCommandPDUsTransferred()
	 * @generated
	 */
	void setCommandPDUsTransferred(Long value);

	/**
	 * Returns the value of the '<em><b>Response PD Us Transferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of Response PDUs transferred on this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response PD Us Transferred</em>' attribute.
	 * @see #setResponsePDUsTransferred(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionStatistics_ResponsePDUsTransferred()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnRspPDUs\"]'"
	 * @generated
	 */
	Long getResponsePDUsTransferred();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getResponsePDUsTransferred <em>Response PD Us Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response PD Us Transferred</em>' attribute.
	 * @see #getResponsePDUsTransferred()
	 * @generated
	 */
	void setResponsePDUsTransferred(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of bytes(data octets) that were transmitted by the local iSCSI node on this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Transmitted</em>' attribute.
	 * @see #setBytesTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionStatistics_BytesTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnTxDataOctets\"]' PUnit='byte'"
	 * @generated
	 */
	Long getBytesTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getBytesTransmitted <em>Bytes Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Transmitted</em>' attribute.
	 * @see #getBytesTransmitted()
	 * @generated
	 */
	void setBytesTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of bytes(data octets) that were received by the local iSCSI node on this session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Received</em>' attribute.
	 * @see #setBytesReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionStatistics_BytesReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnRxDataOctets\"]' PUnit='byte'"
	 * @generated
	 */
	Long getBytesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getBytesReceived <em>Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Received</em>' attribute.
	 * @see #getBytesReceived()
	 * @generated
	 */
	void setBytesReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Digest Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of PDUs which were received on the session and contained header or data digest errors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Digest Errors</em>' attribute.
	 * @see #setDigestErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionStatistics_DigestErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnDigestErrors\"]'"
	 * @generated
	 */
	Long getDigestErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getDigestErrors <em>Digest Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Errors</em>' attribute.
	 * @see #getDigestErrors()
	 * @generated
	 */
	void setDigestErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Connection Timeout Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The count of connections within this session which have been terminated due to timeout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Timeout Errors</em>' attribute.
	 * @see #setConnectionTimeoutErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSISessionStatistics_ConnectionTimeoutErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiSsnCxnTimeoutErrors\"]'"
	 * @generated
	 */
	Long getConnectionTimeoutErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSISessionStatistics#getConnectionTimeoutErrors <em>Connection Timeout Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Timeout Errors</em>' attribute.
	 * @see #getConnectionTimeoutErrors()
	 * @generated
	 */
	void setConnectionTimeoutErrors(Long value);

} // CIM_iSCSISessionStatistics
