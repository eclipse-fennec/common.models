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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM BIOS Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BIOSElement represents the low-level software that is loaded into non-volatile storage and used to bring up and configure a ComputerSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSElement#getPrimaryBIOS <em>Primary BIOS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSElement#getListOfLanguages <em>List Of Languages</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSElement#getCurrentLanguage <em>Current Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSElement#getLoadedStartingAddress <em>Loaded Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSElement#getLoadedEndingAddress <em>Loaded Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSElement#getLoadUtilityInformation <em>Load Utility Information</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSElement#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSElement#getRegistryURIs <em>Registry UR Is</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.54.1' UMLPackagePath='CIM::Application::BIOS' override.Version='string' override.Version.MappingStrings='[\"MIF.DMTF|System BIOS|001.3\"]' override.Manufacturer='string' override.Manufacturer.MappingStrings='[\"MIF.DMTF|System BIOS|001.2\"]' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSElement extends CIM_SoftwareElement {
	/**
	 * Returns the value of the '<em><b>Primary BIOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this is the primary BIOS of the ComputerSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary BIOS</em>' attribute.
	 * @see #setPrimaryBIOS(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement_PrimaryBIOS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIF.DMTF|System BIOS|001.9\"]'"
	 * @generated
	 */
	Boolean getPrimaryBIOS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSElement#getPrimaryBIOS <em>Primary BIOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary BIOS</em>' attribute.
	 * @see #getPrimaryBIOS()
	 * @generated
	 */
	void setPrimaryBIOS(Boolean value);

	/**
	 * Returns the value of the '<em><b>List Of Languages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of installable languages for the BIOS. This information can be obtained from SMBIOS, from the string list that follows the Type 13 structure. An ISO 639 Language Name should be used to specify the BIOS' installable languages. The ISO 3166 Territory Name and the encoding method may also be specified, following the Language Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Of Languages</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement_ListOfLanguages()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getListOfLanguages();

	/**
	 * Returns the value of the '<em><b>Current Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The currently selected language for the BIOS. This information can be obtained from SMBIOS, using the Current Language attribute of the Type 13 structure, to index into the string list following the structure. The property is formatted using the ISO 639 Language Name, and may be followed by the ISO 3166 Territory Name and the encoding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Language</em>' attribute.
	 * @see #setCurrentLanguage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement_CurrentLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_BIOSElement.ListOfLanguages\"]'"
	 * @generated
	 */
	String getCurrentLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSElement#getCurrentLanguage <em>Current Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Language</em>' attribute.
	 * @see #getCurrentLanguage()
	 * @generated
	 */
	void setCurrentLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Loaded Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting address of the memory which this BIOS occupies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loaded Starting Address</em>' attribute.
	 * @see #setLoadedStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement_LoadedStartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|System BIOS|001.5\"]'"
	 * @generated
	 */
	Long getLoadedStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSElement#getLoadedStartingAddress <em>Loaded Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded Starting Address</em>' attribute.
	 * @see #getLoadedStartingAddress()
	 * @generated
	 */
	void setLoadedStartingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Loaded Ending Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ending address of the memory which this BIOS occupies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loaded Ending Address</em>' attribute.
	 * @see #setLoadedEndingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement_LoadedEndingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|System BIOS|001.6\"]'"
	 * @generated
	 */
	Long getLoadedEndingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSElement#getLoadedEndingAddress <em>Loaded Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded Ending Address</em>' attribute.
	 * @see #getLoadedEndingAddress()
	 * @generated
	 */
	void setLoadedEndingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Load Utility Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free form string describing the BIOS flash/load utility that is required to update the BIOSElement. Version and other information may be indicated in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Utility Information</em>' attribute.
	 * @see #setLoadUtilityInformation(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement_LoadUtilityInformation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIF.DMTF|System BIOS|001.7\"]'"
	 * @generated
	 */
	String getLoadUtilityInformation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSElement#getLoadUtilityInformation <em>Load Utility Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Utility Information</em>' attribute.
	 * @see #getLoadUtilityInformation()
	 * @generated
	 */
	void setLoadUtilityInformation(String value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date that this BIOS was released.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement_ReleaseDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIF.DMTF|System BIOS|001.8\"]'"
	 * @generated
	 */
	String getReleaseDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSElement#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(String value);

	/**
	 * Returns the value of the '<em><b>Registry UR Is</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string representing the publication location of the BIOS Attribute registry or registries the implementation complies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registry UR Is</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSElement_RegistryURIs()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getRegistryURIs();

} // CIM_BIOSElement
