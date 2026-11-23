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
 * A representation of the model object '<em><b>CIM Video BIOS Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VideoBIOSElement represents the low-level software that is loaded into non-volatile storage and used to bring up, configure and access a ComputerSystem's VideoController and Display.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VideoBIOSElement#getIsShadowed <em>Is Shadowed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VideoBIOSElement#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VideoBIOSElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::BIOS' override.Version='string' override.Version.MappingStrings='[\"MIF.DMTF|Video BIOS|001.3\"]' override.Manufacturer='string' override.Manufacturer.MappingStrings='[\"MIF.DMTF|Video BIOS|001.2\"]' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem'"
 * @generated
 */
@ProviderType
public interface CIM_VideoBIOSElement extends CIM_SoftwareElement {
	/**
	 * Returns the value of the '<em><b>Is Shadowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the Video BIOS is shadowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Shadowed</em>' attribute.
	 * @see #setIsShadowed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoBIOSElement_IsShadowed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIF.DMTF|Video BIOS|001.5\"]'"
	 * @generated
	 */
	Boolean getIsShadowed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoBIOSElement#getIsShadowed <em>Is Shadowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shadowed</em>' attribute.
	 * @see #getIsShadowed()
	 * @generated
	 */
	void setIsShadowed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date that this BIOS was released.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VideoBIOSElement_ReleaseDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIF.DMTF|Video BIOS|001.4\"]'"
	 * @generated
	 */
	String getReleaseDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VideoBIOSElement#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(String value);

} // CIM_VideoBIOSElement
