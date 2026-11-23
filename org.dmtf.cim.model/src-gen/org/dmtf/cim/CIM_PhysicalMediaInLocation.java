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
 * A representation of the model object '<em><b>CIM Physical Media In Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Within a StorageLibrary, all Media should be accounted for, and be present in some Storage Location. This relationship is made explicit by the PhysicalMediaInLocation association. In addition, one can determine if a Location is empty or full based on whether this association exists for the StorageMediaLocation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMediaInLocation#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMediaInLocation#getTimeOfLastPlacement <em>Time Of Last Placement</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMediaInLocation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::PhysicalMedia' override.Antecedent='CIM_StorageMediaLocation REF' override.Antecedent.Max='1' override.Antecedent.Description='The StorageMediaLocation which holds the PhysicalMedia.' override.Dependent='CIM_PhysicalMedia REF' override.Dependent.Description='The Media in the Location.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalMediaInLocation extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration expressing which 'Side' of the Media is facing up. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property. Also, the value 5 ("Not Applicable" describes that orientation is not pertinent for this Media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMediaInLocation_Orientation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Side 0\",\"Side 1\",\"Side A\",\"Side B\",\"Not Applicable\"]'"
	 * @generated
	 */
	Integer getOrientation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMediaInLocation#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Of Last Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that the Media was last placed into the referenced Location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Placement</em>' attribute.
	 * @see #setTimeOfLastPlacement(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMediaInLocation_TimeOfLastPlacement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastPlacement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMediaInLocation#getTimeOfLastPlacement <em>Time Of Last Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Placement</em>' attribute.
	 * @see #getTimeOfLastPlacement()
	 * @generated
	 */
	void setTimeOfLastPlacement(String value);

} // CIM_PhysicalMediaInLocation
