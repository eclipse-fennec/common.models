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
 * A representation of the model object '<em><b>CIM Device Services Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Within an automated StorageLibrary, Media should be accessible to the various robotics and MediaTransferDevices (Pickers, Changers, InterLibraryPorts, etc.). The Library may be serviced by different TransferDevices, each responsible for a subset of the Library's StorageMediaLocations. The Device ServicesLocation association indicates that the Transfer Device handles Media stored in the referenced Location. For example, LibraryPort 'A' may only service Media from Slots 1-10, while LibraryPort 'B' covers Slots 11-33. This detail is conveyed by this association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DeviceServicesLocation#getInaccessible <em>Inaccessible</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceServicesLocation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' override.Antecedent='CIM_MediaTransferDevice REF' override.Antecedent.Description='The MediaTransferDevice that handles Media from the StorageMediaLocation.' override.Dependent='CIM_StorageMediaLocation REF' override.Dependent.Description='The MediaLocation that is serviced.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceServicesLocation extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Inaccessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the referenced StorageMediaLocation is not currently accessible to the MediaTransferDevice. For example, the Location could be the realization of an InterLibraryPort that is currently servicing another Library. The DeviceServicesLocation association describes that the TransferDevice COULD service the MediaLocation. This boolean indicates that that this is temporarily not possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inaccessible</em>' attribute.
	 * @see #setInaccessible(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceServicesLocation_Inaccessible()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getInaccessible();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceServicesLocation#getInaccessible <em>Inaccessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inaccessible</em>' attribute.
	 * @see #getInaccessible()
	 * @generated
	 */
	void setInaccessible(Boolean value);

} // CIM_DeviceServicesLocation
