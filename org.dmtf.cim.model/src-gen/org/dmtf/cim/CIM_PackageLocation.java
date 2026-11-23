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
 * A representation of the model object '<em><b>CIM Package Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PackageLocation is a space/hole/shelf, possibly with mounting brackets or other connecting hardware, where other PhysicalPackages may be placed. This class describes an entity that holds something else and is not just a 'place' (as is conveyed by the CIM_Location object). This class has several corollaries to HostingBoard. Where a HostingBoard (backplane) has connectors/slots to describe the capabilities of holding additional PhysicalPackages, a PackageLocation is used to describe the same case for the general package, where there may or may not be no connectors. Examples of PackageLocations would include a disk cage in a tower PC or the chassis area where the power supply is mounted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PackageLocation#getLocationCoordinates <em>Location Coordinates</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackageLocation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Physical::Package' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PackageLocation extends CIM_PhysicalPackage {
	/**
	 * Returns the value of the '<em><b>Location Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LocationCoordinates represent the physical location of the the FrameSlot instance. The property is defined as a free-form string to allow the location information to be described in vendor-unique terminology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Coordinates</em>' attribute.
	 * @see #setLocationCoordinates(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PackageLocation_LocationCoordinates()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLocationCoordinates();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PackageLocation#getLocationCoordinates <em>Location Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Coordinates</em>' attribute.
	 * @see #getLocationCoordinates()
	 * @generated
	 */
	void setLocationCoordinates(String value);

} // CIM_PackageLocation
