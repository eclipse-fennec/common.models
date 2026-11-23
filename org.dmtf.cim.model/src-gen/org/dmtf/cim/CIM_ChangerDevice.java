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
 * A representation of the model object '<em><b>CIM Changer Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ChangerDevices represent hardware that moves PhysicalMedia within a System, such as a StorageLibrary.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ChangerDevice#getMaxTransitTime <em>Max Transit Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ChangerDevice#getMediaFlipSupported <em>Media Flip Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ChangerDevice#getAuditInProgress <em>Audit In Progress</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ChangerDevice#getAuditsPerformed <em>Audits Performed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ChangerDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_ChangerDevice extends CIM_MediaTransferDevice {
	/**
	 * Returns the value of the '<em><b>Max Transit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum time in seconds between a PickerElement pick and place. It should be reported as the transit time between the two most physically distant StorageMedia Locations in a System. The maximum time interval for moving a Media from one point to another is the sum of the PickerElement's MaxPickTime, the ChangerDevice's Max TransitTime and the PickerElement's MaxPutTime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Transit Time</em>' attribute.
	 * @see #setMaxTransitTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ChangerDevice_MaxTransitTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getMaxTransitTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ChangerDevice#getMaxTransitTime <em>Max Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Transit Time</em>' attribute.
	 * @see #getMaxTransitTime()
	 * @generated
	 */
	void setMaxTransitTime(Long value);

	/**
	 * Returns the value of the '<em><b>Media Flip Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean set to TRUE if the Changer supports media flipping. Media needs to be flipped when multi-sided PhysicalMedia are placed into a MediaAccessDevice that does NOT support dual sided access.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Flip Supported</em>' attribute.
	 * @see #setMediaFlipSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ChangerDevice_MediaFlipSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMediaFlipSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ChangerDevice#getMediaFlipSupported <em>Media Flip Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Flip Supported</em>' attribute.
	 * @see #getMediaFlipSupported()
	 * @generated
	 */
	void setMediaFlipSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Audit In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean set to TRUE if an audit is currently being performed by the Changer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audit In Progress</em>' attribute.
	 * @see #setAuditInProgress(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ChangerDevice_AuditInProgress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAuditInProgress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ChangerDevice#getAuditInProgress <em>Audit In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit In Progress</em>' attribute.
	 * @see #getAuditInProgress()
	 * @generated
	 */
	void setAuditInProgress(Boolean value);

	/**
	 * Returns the value of the '<em><b>Audits Performed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A count of the number of audits performed by the Changer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audits Performed</em>' attribute.
	 * @see #setAuditsPerformed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ChangerDevice_AuditsPerformed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAuditsPerformed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ChangerDevice#getAuditsPerformed <em>Audits Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audits Performed</em>' attribute.
	 * @see #getAuditsPerformed()
	 * @generated
	 */
	void setAuditsPerformed(Long value);

} // CIM_ChangerDevice
