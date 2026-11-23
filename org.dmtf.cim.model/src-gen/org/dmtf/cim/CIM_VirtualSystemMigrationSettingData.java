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
 * A representation of the model object '<em><b>CIM Virtual System Migration Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_MigrationSettingData defines the parameters to control a virtual system migration implementation, as managed by a CIM_VirtualSystemMigrationService. It is expected that a migration implementation will subclass this class to add implementation-specific migration options.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getMigrationType <em>Migration Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getBandwidthUnit <em>Bandwidth Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getOtherTransportType <em>Other Transport Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getTransportType <em>Transport Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemMigrationSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.33.0' UMLPackagePath='CIM::System::Virtualization' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualSystemMigrationSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Migration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MigrationType describes a type of migration operation to be performed.
	 * A value of 2 - Virtual System is to be migrated in a 'live' manner such that the running of the Virtual System is minimally impacted during the move.
	 * A value of 3 - Virtual System will be temporarily paused prior to migration and then resume running after it is moved.
	 * A value of 4 - The Virtual System will be quiesced to a stopped state prior to migration and then restarted after it is moved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Migration Type</em>' attribute.
	 * @see #setMigrationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemMigrationSettingData_MigrationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Live\",\"Resume\",\"Restart\"]'"
	 * @generated
	 */
	Integer getMigrationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getMigrationType <em>Migration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migration Type</em>' attribute.
	 * @see #getMigrationType()
	 * @generated
	 */
	void setMigrationType(Integer value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Priority specifies a relative migration importance which the virtual system migration implementation may use to order or otherwise give preference among multiple pending migration requests. The lower the value, the higher the priority. A value of 0 indicates:
	 * - in migration requests the default priority
	 * - otherwise that priorities are not supported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemMigrationSettingData_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bandwidth indicates the bandwidth assigned to or requested for a virtual system migration operation. The special value 0 indicates:
	 * - in migration requests the default bandwidth
	 * - otherwise that bandwidths are not supported.
	 * Bandwidth and Priority may be used in conjunction. Migration processes that have the highest equal priority value share the available bandwidth based on their requested bandwidth. If not all bandwidth is consumed by this set of processes, migration processes with the next lower equal priority share the remaining bandwidth. If still more bandwidth remains, migration processes with the next lower equal priority are considered, and so forth.
	 * The unit applicable for the Bandwidth property is conveyed by the value of the BandwidthUnit property. If the value of the BandwidthUnit property matches "percent", the following restrictions apply: 
	 * The value of the Bandwidth property shall be between 0 and 100, with higher values indicating a higher bandwidth. A value of 100 indicates the total available bandwidth for performing virtual system migration operations. Values between 1 and 100 should linearly correlate with the available bandwidth range. For exampe, a value of 50 should request half of the available bandwidth, a value of 33 should request one third of the bandwidth, etc. .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth</em>' attribute.
	 * @see #setBandwidth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemMigrationSettingData_Bandwidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Gauge='true' ModelCorrespondence='[\"CIM_VirtualSystemMigrationSettingData.BandwidthUnit\"]'"
	 * @generated
	 */
	Integer getBandwidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getBandwidth <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' attribute.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Bandwidth Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the unit used by the Bandwidth property. The value of this property shall be a legal value of the Programmatic Units qualifier as defined in Appendix C.1 of DSP0004 V2.4 or later.
	 * NOTE: Profiles like DMTF DSP1081 define means by that clients are enabled to discover the set of units supported by an implementation, along with ranges and increments for admissable values of the Bandwidth property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwidth Unit</em>' attribute.
	 * @see #setBandwidthUnit(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemMigrationSettingData_BandwidthUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_VirtualSystemMigrationSettingData.Bandwidth\"]' IsPUnit='true'"
	 * @generated
	 */
	String getBandwidthUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getBandwidthUnit <em>Bandwidth Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Unit</em>' attribute.
	 * @see #getBandwidthUnit()
	 * @generated
	 */
	void setBandwidthUnit(String value);

	/**
	 * Returns the value of the '<em><b>Other Transport Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherTransportType indicates the type of transport to be applied if the value of TransportType is 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Transport Type</em>' attribute.
	 * @see #setOtherTransportType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemMigrationSettingData_OtherTransportType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_VirtualSystemMigrationSettingData.TransportType\"]'"
	 * @generated
	 */
	String getOtherTransportType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getOtherTransportType <em>Other Transport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Transport Type</em>' attribute.
	 * @see #getOtherTransportType()
	 * @generated
	 */
	void setOtherTransportType(String value);

	/**
	 * Returns the value of the '<em><b>Transport Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TransportType indicates the type of transport to be applied for a virtual system migration operation.
	 * - 0(Unknown) indicates that the transport type is not exposed.- 1(Other) indicates that the transport type is specified as a textual value of the OtherTransportType property.
	 * - 2(SSH) indicates the secure shell transport type.
	 * - 3(TLS) indicats the transport layer security transport type.
	 * - 4(TLS strict) indicats the transport layer security transport type with mutual authentication.
	 * - 5(TCP) indicates the TCP transport type.
	 * - 6(IPC) indicates the inter-process communication socket transport type. This transport type includes Unix domain sockets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Type</em>' attribute.
	 * @see #setTransportType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemMigrationSettingData_TransportType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..\"]' Values='[\"Unknown\",\"Other\",\"SSH\",\"TLS\",\"TLS Strict\",\"TCP\",\"IPC\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_VirtualSystemMigrationSettingData.OtherTransportType\"]'"
	 * @generated
	 */
	Integer getTransportType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualSystemMigrationSettingData#getTransportType <em>Transport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Type</em>' attribute.
	 * @see #getTransportType()
	 * @generated
	 */
	void setTransportType(Integer value);

} // CIM_VirtualSystemMigrationSettingData
