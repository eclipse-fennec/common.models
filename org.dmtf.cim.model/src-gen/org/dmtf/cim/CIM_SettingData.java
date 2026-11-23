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
 * A representation of the model object '<em><b>CIM Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_SettingData is used to represent configuration and and operational parameters for CIM_ManagedElement instances. There are a number of different uses of CIM_SettingData supported in the model today. Additional uses may be defined in the future.
 * Instances of CIM_SettingData may represent Aspects of a CIM_ManagedElement instance. This is modeled using the CIM_SettingsDefineState association. CIM_SettingData may be used to define capabilities when associated to an instance of CIM_Capabilities through the CIM_SettingsDefineCapabilities association. 
 * Instances of CIM_SettingData may represent different types of configurations for a CIM_ManagedElement, including persistent configurations, in progress configuration changes, or requested configurations. The CIM_ElementSettingData association is used to model the relationship between a CIM_SettingData instance and the CIM_ManagedElement for which it is a configuration. 
 * When an instance of CIM_SettingData represents a configuration, the current operational values for the parameters of the element are reflected by properties in the Element itself or by properties in its associations. These properties do not have to be the same values that are present in the SettingData object. For example, a modem might have a SettingData baud rate of 56Kb/sec but be operating at 19.2Kb/sec. 
 * Note: The CIM_SettingData class is very similar to CIM_Setting, yet both classes are present in the model because many implementations have successfully used CIM_Setting. However, issues have arisen that could not be resolved without defining a new class. Therefore, until a new major release occurs, both classes will exist in the model. Refer to the Core White Paper for additional information. SettingData instances can be aggregated together into higher- level SettingData objects using ConcreteComponent associations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SettingData#getChangeableType <em>Changeable Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingData#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingData#getComponentSetting <em>Component Setting</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingData#getSoID <em>So ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingData#getSoOrgID <em>So Org ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SettingData()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' ClassConstraint='[\"inv: SoID &lt;&gt; null implies SoOrgID &lt;&gt; null\"]' UMLPackagePath='CIM::Core::Settings' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' override.ElementName='string' override.ElementName.Required='true' override.ElementName.Description='The user-friendly name for this instance of SettingData. In addition, the user-friendly name can be used as an index property for a search or query. (Note: The name does not have to be unique within a namespace.)' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SettingData extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Changeable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of setting. 0 "Not Changeable - Persistent" indicates the instance of SettingData represents primordial settings and shall not be modifiable. 1 "Changeable - Transient" indicates the SettingData represents modifiable settings that are not persisted. Establishing persistent settings from transient settings may be supported. 2 "Changeable - Persistent" indicates the SettingData represents a persistent configuration that may be modified. 3 "Not Changeable - Transient" indicates the SettingData represents a snapshot of the settings of the associated ManagedElement and is not persistent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changeable Type</em>' attribute.
	 * @see #setChangeableType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingData_ChangeableType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Not Changeable - Persistent\",\"Changeable - Transient\",\"Changeable - Persistent\",\"Not Changeable - Transient\"]'"
	 * @generated
	 */
	Integer getChangeableType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingData#getChangeableType <em>Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable Type</em>' attribute.
	 * @see #getChangeableType()
	 * @generated
	 */
	void setChangeableType(Integer value);

	/**
	 * Returns the value of the '<em><b>Configuration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instance of CIM_SettingData may correspond to a well-known configuration that exists for an associated CIM_ManagedElement. If the ConfigurationName property is non-NULL, the instance of CIM_SettingData shall correspond to a well-known configuration for a Managed Element, the value of the ConfigurationName property shall be the name of the configuration, and the ChangeableType property shall have the value 0 or 2. A value of NULL for the ConfigurationName property shall mean that the instance of CIM_SettingData does not correspond to a well-known configuration for a Managed Element or that this information is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Name</em>' attribute.
	 * @see #setConfigurationName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingData_ConfigurationName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getConfigurationName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingData#getConfigurationName <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name</em>' attribute.
	 * @see #getConfigurationName()
	 * @generated
	 */
	void setConfigurationName(String value);

	/**
	 * Returns the value of the '<em><b>Component Setting</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of each CIM_ComponentSetting instance includes a CIM_SettingData instance that specifies further values for this CIM_SettingData instance. The values are interpreted according to the values of the Policy, ValueRole, and ValueRange properties included in each CIM_ComponentSetting instance.
	 * 
	 * Note: If SoID is not null, then the embedded ComponentSetting elements may be interpreted as ITIL Service Level Targets.
	 * Note: For CIM v3, the type of ComponentSetting will be CIM_ComponentSetting. This is not represented as an EmbeddedInstance in CIM v2 to avoid a circular dependency that CIM v2 compilers cannot handle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Setting</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingData_ComponentSetting()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedObject='true'"
	 * @generated
	 */
	EList<String> getComponentSetting();

	/**
	 * Returns the value of the '<em><b>So ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not Null, the CIM_SettingData instance is being used to represent an ITIL element: either a service option, a service level requirement, or a service level target. The value SoID must be unique in the context of an Organization unique identifier specified in SoOrgID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>So ID</em>' attribute.
	 * @see #setSoID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingData_SoID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SettingData.SoOrgID\"]'"
	 * @generated
	 */
	String getSoID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingData#getSoID <em>So ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So ID</em>' attribute.
	 * @see #getSoID()
	 * @generated
	 */
	void setSoID(String value);

	/**
	 * Returns the value of the '<em><b>So Org ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not Null, the CIM_SettingData instance is being used to represent an ITIL element: either a service option, a service level requirement, or a service level target. When not Null, the value of SoOrgID shall be a unique identifier for the organization that specifies the value of SoID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>So Org ID</em>' attribute.
	 * @see #setSoOrgID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingData_SoOrgID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SettingData.SoID\"]'"
	 * @generated
	 */
	String getSoOrgID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingData#getSoOrgID <em>So Org ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So Org ID</em>' attribute.
	 * @see #getSoOrgID()
	 * @generated
	 */
	void setSoOrgID(String value);

} // CIM_SettingData
