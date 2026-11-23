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
 * A representation of the model object '<em><b>CIM Security Association Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SecurityAssociationEndpoint (SAEndpoint) represents the endpoint of a secure connection. This is typically an IP connection, although the model allows more flexibility than just IP. The SecurityAssociationEndpoint is tied to an IPProtocolEndpoint (or possibly other endpoint) using the LogicalIdentity association. Note that an endpoint is defined at both ends of the connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getLifetimeSeconds <em>Lifetime Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getRefreshThresholdSecondsPercentage <em>Refresh Threshold Seconds Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getIdleDurationSeconds <em>Idle Duration Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getLifetimeKilobytes <em>Lifetime Kilobytes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getRefreshThresholdKbytesPercentage <em>Refresh Threshold Kbytes Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getPacketLoggingActive <em>Packet Logging Active</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SecurityAssociationEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' override.InstallDate='datetime' override.InstallDate.Description='InstallDate records when the SA (and its endpoint) was created.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SecurityAssociationEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Lifetime Seconds</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LifetimeSeconds specifies the maximum time that the SA will be considered valid after it has been created. A value of zero indicates that the default of 8 hours be used. A non-zero value indicates the seconds lifetime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifetime Seconds</em>' attribute.
	 * @see #setLifetimeSeconds(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SecurityAssociationEndpoint_LifetimeSeconds()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getLifetimeSeconds();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getLifetimeSeconds <em>Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime Seconds</em>' attribute.
	 * @see #getLifetimeSeconds()
	 * @generated
	 */
	void setLifetimeSeconds(Long value);

	/**
	 * Returns the value of the '<em><b>Refresh Threshold Seconds Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RefreshThresholdSecondsPercentage is the lifetime percentage after which a new SA should be acquired, before the existing SA expires. A random period may be added to a calculated threshold to reduce network thrashing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Threshold Seconds Percentage</em>' attribute.
	 * @see #setRefreshThresholdSecondsPercentage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SecurityAssociationEndpoint_RefreshThresholdSecondsPercentage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' Units='Percent' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getRefreshThresholdSecondsPercentage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getRefreshThresholdSecondsPercentage <em>Refresh Threshold Seconds Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Threshold Seconds Percentage</em>' attribute.
	 * @see #getRefreshThresholdSecondsPercentage()
	 * @generated
	 */
	void setRefreshThresholdSecondsPercentage(Integer value);

	/**
	 * Returns the value of the '<em><b>Idle Duration Seconds</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IdleDurationSeconds specifies how long the SA can be idle before it is deleted. The default value, 0, indicates that there is no idle timeout period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idle Duration Seconds</em>' attribute.
	 * @see #setIdleDurationSeconds(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SecurityAssociationEndpoint_IdleDurationSeconds()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getIdleDurationSeconds();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getIdleDurationSeconds <em>Idle Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Duration Seconds</em>' attribute.
	 * @see #getIdleDurationSeconds()
	 * @generated
	 */
	void setIdleDurationSeconds(Long value);

	/**
	 * Returns the value of the '<em><b>Lifetime Kilobytes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LifetimeKilobytes specifies the maximum number of kilobytes of data traffic to be protected by the SA. A value of zero (the default) indicates that there should be no maximum kilobyte lifetime. A non-zero value specifies the desired kilobyte lifetime. The SA is deleted when the LifetimeKilobyte value is exceeded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifetime Kilobytes</em>' attribute.
	 * @see #setLifetimeKilobytes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SecurityAssociationEndpoint_LifetimeKilobytes()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getLifetimeKilobytes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getLifetimeKilobytes <em>Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime Kilobytes</em>' attribute.
	 * @see #getLifetimeKilobytes()
	 * @generated
	 */
	void setLifetimeKilobytes(Long value);

	/**
	 * Returns the value of the '<em><b>Refresh Threshold Kbytes Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RefreshThresholdKbytesPercentage is the lifetime percentage of kilobytes processed, at which a new SA should be acquired. A random value may be added to the calculated threshold to reduce network thrashing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Threshold Kbytes Percentage</em>' attribute.
	 * @see #setRefreshThresholdKbytesPercentage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SecurityAssociationEndpoint_RefreshThresholdKbytesPercentage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' Units='Percent' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getRefreshThresholdKbytesPercentage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getRefreshThresholdKbytesPercentage <em>Refresh Threshold Kbytes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Threshold Kbytes Percentage</em>' attribute.
	 * @see #getRefreshThresholdKbytesPercentage()
	 * @generated
	 */
	void setRefreshThresholdKbytesPercentage(Integer value);

	/**
	 * Returns the value of the '<em><b>Packet Logging Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PacketLoggingActive causes a log to be kept of traffic processed by the SAEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packet Logging Active</em>' attribute.
	 * @see #setPacketLoggingActive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SecurityAssociationEndpoint_PacketLoggingActive()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getPacketLoggingActive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SecurityAssociationEndpoint#getPacketLoggingActive <em>Packet Logging Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Logging Active</em>' attribute.
	 * @see #getPacketLoggingActive()
	 * @generated
	 */
	void setPacketLoggingActive(Boolean value);

} // CIM_SecurityAssociationEndpoint
