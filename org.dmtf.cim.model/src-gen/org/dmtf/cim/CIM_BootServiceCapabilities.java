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
 * A representation of the model object '<em><b>CIM Boot Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Capabilities that describes the boot configuration management aspects of a system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BootServiceCapabilities#getBootConfigCapabilities <em>Boot Config Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BootServiceCapabilities#getOtherBootConfigCapabilities <em>Other Boot Config Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BootServiceCapabilities#getBootStringsSupported <em>Boot Strings Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BootServiceCapabilities#getBootCapabilitiesSupported <em>Boot Capabilities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BootServiceCapabilities#getOtherBootCapabilitiesSupported <em>Other Boot Capabilities Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BootServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::System::Boot' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BootServiceCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Boot Config Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the boot related operations that can be applied to a managed element. Since this is an array, multiple values may be specified. The current values in the enumeration are: 
	 * 0 = "Unknown", indicating that the capabilities are not known at this time. If this value is present in the array, it shall be the only value.
	 * 1 = "Other", indicating that a capability not described by another value is present. A description of the capability can be found in the OtherBootConfigCapabilities property. "Other" can be present more than once in the BootConfigCapabilities array. 
	 * 2 = "Creates Boot Configuration", indicating that a boot service can create new boot configuration using an existing boot configuration as a template. 
	 * 3 = "Applies Boot Configuration", indicating that a boot service can apply the boot configuration of a computer system, without requiring a reset of the the computer system.
	 * 4 = "Sets Boot Role", indicating that a boot service can set the role (Default or Next) of a boot configuration that is associated to a one or more computer systems.
	 * 5 = "Sets Boot Usage", indicating that a boot service can set or unset the role (Default or Next) of a boot configuration for a specific computer system.
	 * 6 = "Change Boot Order Method Not Supported", indicating that a boot service cannot change the boot order using the CIM_BootConfigSetting.ChangeBootOrder() method
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boot Config Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BootServiceCapabilities_BootConfigCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"Creates Boot Configuration\",\"Applies Boot Configuration\",\"Sets Boot Role\",\"Sets Boot Usage\",\"Change Boot Order Not Supported\"]' ModelCorrespondence='[\"CIM_BootServiceCapabilities.OtherBootConfigCapabilities\"]'"
	 * @generated
	 */
	EList<Integer> getBootConfigCapabilities();

	/**
	 * Returns the value of the '<em><b>Other Boot Config Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the additional boot configuration capabilities of the element, used when the corresponding BootConfigCapabilities array element is set to the value 1, "Other".Each element that corresponds to a BootCapabilitiesSupported array element with a value other than 1 "Other" shall have a value of NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Boot Config Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BootServiceCapabilities_OtherBootConfigCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_BootServiceCapabilities.BootConfigCapabilities\"]'"
	 * @generated
	 */
	EList<String> getOtherBootConfigCapabilities();

	/**
	 * Returns the value of the '<em><b>Boot Strings Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the boot string properties in the CIM_BootSourceSetting which are supported. If the array contains a value, then all the BootSourceSetting instances managed by the service are guaranteed to have a non-null value for the corresponding property.Since this is an array, multiple values may be specified. The values in the enumeration are: 
	 * 2 = BootString property supported 
	 * 3 = BIOSBootString property supported 
	 * 4 = StructureBootString property supported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boot Strings Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BootServiceCapabilities_BootStringsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"BootString\",\"BIOSBootString\",\"StructuredBootString\"]' ModelCorrespondence='[\"CIM_BootSourceSetting.BootString\",\"CIM_BootSourceSetting.BIOSBootString\",\"CIM_BootSourceSetting.StructuredBootString\"]'"
	 * @generated
	 */
	EList<Integer> getBootStringsSupported();

	/**
	 * Returns the value of the '<em><b>Boot Capabilities Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating boot related capabilities that are not related to showing support for operations of a managed element. Since this is an array, multiple values may be specified. The current values in the enumeration are: 
	 * 0 = "Unknown", indicating that the capabilities are not known at this time. If this value is present in the array, it shall be the only value.
	 * 1 = "Other", indicating that a capability not described by another value is present. A description of the capability can be found in the OtherBootConfigCapabilities property. "Other" can be present more than once in the BootCapabilitiesSupported array. 
	 * 2 = "State Data Supported" indicating that real-time boot related state properties of systems are modeled using 'State' BootConfigSetting instances. In this methodology, each system shall be associated to a boot configuration representing the boot related state data via SettingsDefineState. All persistent boot configurations shall be related to the 'State' instance via ElementSettingData associations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boot Capabilities Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BootServiceCapabilities_BootCapabilitiesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Other\",\"State Data Supported\"]'"
	 * @generated
	 */
	EList<Integer> getBootCapabilitiesSupported();

	/**
	 * Returns the value of the '<em><b>Other Boot Capabilities Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the additional boot capabilities of the element, used when the corresponding BootCapabilitiesSupported array element is set to the value 1, "Other". Each element that corresponds to a BootCapabilitiesSupported array element with a value other than 1 "Other" shall have a value of NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Boot Capabilities Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BootServiceCapabilities_OtherBootCapabilitiesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_BootServiceCapabilities.BootCapabilitiesSupported\"]'"
	 * @generated
	 */
	EList<String> getOtherBootCapabilitiesSupported();

} // CIM_BootServiceCapabilities
