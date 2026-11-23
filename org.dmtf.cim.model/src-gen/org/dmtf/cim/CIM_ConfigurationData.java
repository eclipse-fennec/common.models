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
 * A representation of the model object '<em><b>CIM Configuration Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures the configuration information of the element as an octet string (that is, a "blob"). The configuration data is element-specific and generalizes (for any element) the semantically similar Save/RestoreProperties methods that are currently defined as part of the LogicalDevice class. 
 * Various types of configurations can be instantiated for an element, such as a currently running config, a startup config, or other possible configurations. The configuration type is specified in the association of the instance to a ManagedElement using the properties of the ElementSettingData association: 
 * - When the configuration is currently running, then the IsCurrent Boolean of the association is true. 
 * - When the configuration is the initial or startup config, then the IsDefault Boolean is true. 
 * - If the IsCurrent and IsDefault Booleans are false, then the configuration is assumed to be a "possible" config (configuration workspace) for the element. 
 * Note: This class has an "apply" method only with no corresponding "extract". It has no extract because an application or client can query for and enumerate any existing configurations using existing CIM Operations. It is the responsibility of the client to reuse or reapply the configurations that are returned by such a request because the configuration data itself is opaque and element-specific. 
 * Only one "running" configuration can exist at any time. In addition, this configuration can be the only configuration reported by an element. However, elements can also have one "startup" configuration and can have multiple possible/workspace configurations. The configurations can be identical. For example, if a possible configuration is applied to an element (and therefore made the running/current configuration), then the two configs would be identical upon a subsequent query or enumerate instances request.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationData#getConfigurationInformation <em>Configuration Information</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConfigurationData#getConfigurationTimestamp <em>Configuration Timestamp</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core::Settings' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ConfigurationData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Configuration Information</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The configuration information stored as an octet string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Information</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationData_ConfigurationInformation()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Required='true' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getConfigurationInformation();

	/**
	 * Returns the value of the '<em><b>Configuration Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The datetime when the configuration information was obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Timestamp</em>' attribute.
	 * @see #setConfigurationTimestamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConfigurationData_ConfigurationTimestamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Required='true'"
	 * @generated
	 */
	String getConfigurationTimestamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConfigurationData#getConfigurationTimestamp <em>Configuration Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Timestamp</em>' attribute.
	 * @see #getConfigurationTimestamp()
	 * @generated
	 */
	void setConfigurationTimestamp(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method processes the configuration data for an element. In this case, the data in the ConfigurationInformation property of the instance is validated for the specified element (if the ValidateOnly parameter is true), or is actually set as a configuration on the element. If the method is successful, then the appropriate ElementSettingData associations are created or modified. Note: It is not necessary for the element to be associated with the ConfigurationData instance at the time that this method is called.
	 * @param ValidateOnly Indicates that the request is to validate the format and syntax of the configuration data but not apply it to the referenced ManagedElement.
	 * @param TypeOfConfiguration The type of configuration information, indicating whether the ConfigurationInformation property holds an initial/default configuration, a running/current configuration, or a configuration for a temporary/ possible workspace. This information affects the values of the IsDefault and IsCurrent properties of the association, ElementSettingData.
	 * @param ManagedElement A reference to the ManagedElement whose configuration data is validated or applied. This reference is necessary because a configuration could apply to multiple elements simultaneously, but this processing request is more restrictive.
	 * <!-- end-model-doc -->
	 * @model ValidateOnlyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" TypeOfConfigurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Running/Current Configuration\",\"Initial/Default Configuration\",\"Possible Configuration/Config Workspace\"]'" ManagedElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..15999\",\"16000\",\"16001\",\"16002\",\"16003\",\"16004\",\"16005\",\"16006..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Validate Only Request Not Supported\",\"Configuration Data Would Not Validate\",\"Element Does Not Support Initial/Default Configs\",\"Element Does Not Support Possible Configs/Config Workspaces\",\"Element Does Not Support Setting of the Running/Current Config\",\"Element Would Not Accept Configuration\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ApplyConfiguration(Boolean ValidateOnly, Integer TypeOfConfiguration, CIM_ManagedElement ManagedElement);

} // CIM_ConfigurationData
