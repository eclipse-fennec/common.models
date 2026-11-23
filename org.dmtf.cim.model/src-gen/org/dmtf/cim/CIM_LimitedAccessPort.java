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
 * A representation of the model object '<em><b>CIM Limited Access Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LimitedAccessPorts represent hardware that transports Physical Media into or out of a System, such as a StorageLibrary. They are identified as 'limited' since these Ports do not provide access to ALL the PhysicalMedia or StorageMediaLocations in a Library, but only to a subset.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LimitedAccessPort#getLocked <em>Locked</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LimitedAccessPort#getExtended <em>Extended</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LimitedAccessPort#getExtendTimeout <em>Extend Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LimitedAccessPort#getLastExtended <em>Last Extended</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LimitedAccessPort#getImportCount <em>Import Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LimitedAccessPort#getExportCount <em>Export Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LimitedAccessPort#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LimitedAccessPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_LimitedAccessPort extends CIM_MediaTransferDevice {
	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Port is 'locked' (TRUE) or 'unlocked' (FALSE). When the Port is locked, access its Media Locations is prevented without the use of a physical key, front panel activity or the issuance of a software unlock command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LimitedAccessPort_Locked()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLocked();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LimitedAccessPort#getLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #getLocked()
	 * @generated
	 */
	void setLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a Port is 'Extended' or 'open' (value=TRUE), its Storage MediaLocations are accessible to a human operator. If not extended (value=FALSE), the Locations are accessible to a PickerElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended</em>' attribute.
	 * @see #setExtended(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LimitedAccessPort_Extended()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getExtended();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LimitedAccessPort#getExtended <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' attribute.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(Boolean value);

	/**
	 * Returns the value of the '<em><b>Extend Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a LimitedAccessPort is 'Extended', all related media- transfer componentry may be stopped. The ExtendTimeout property provides a mechanism to event on a Port left open for a period of time (in seconds) exceeding the property's value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extend Timeout</em>' attribute.
	 * @see #setExtendTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LimitedAccessPort_ExtendTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getExtendTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LimitedAccessPort#getExtendTimeout <em>Extend Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend Timeout</em>' attribute.
	 * @see #getExtendTimeout()
	 * @generated
	 */
	void setExtendTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Last Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and time that the Port was last extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Extended</em>' attribute.
	 * @see #setLastExtended(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LimitedAccessPort_LastExtended()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastExtended();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LimitedAccessPort#getLastExtended <em>Last Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Extended</em>' attribute.
	 * @see #getLastExtended()
	 * @generated
	 */
	void setLastExtended(String value);

	/**
	 * Returns the value of the '<em><b>Import Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the LimitedAccessPort was used to move a PhysicalMedia into the System/StorageLibrary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Count</em>' attribute.
	 * @see #setImportCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LimitedAccessPort_ImportCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getImportCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LimitedAccessPort#getImportCount <em>Import Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Count</em>' attribute.
	 * @see #getImportCount()
	 * @generated
	 */
	void setImportCount(Long value);

	/**
	 * Returns the value of the '<em><b>Export Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the LimitedAccessPort was used to move a PhysicalMedia out of the System/StorageLibrary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Export Count</em>' attribute.
	 * @see #setExportCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LimitedAccessPort_ExportCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getExportCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LimitedAccessPort#getExportCount <em>Export Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Count</em>' attribute.
	 * @see #getExportCount()
	 * @generated
	 */
	void setExportCount(Long value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration expressing whether the Port is used for import into the Library/System which scopes and names it (value=1), export from the Library/System (value=2), or both (value=3).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LimitedAccessPort_Direction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Import\",\"Export\",\"Both Import and Export\"]'"
	 * @generated
	 */
	Integer getDirection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LimitedAccessPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Integer value);

} // CIM_LimitedAccessPort
