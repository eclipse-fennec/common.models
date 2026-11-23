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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Element Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ElementSettingData represents the association between ManagedElements and applicable setting data. This association also describes whether this is a default or current setting. Each non-null, non-key property of the associated SettingData instance defines a setting value for the associated ManagedElement. The properties, IsDefault, IsCurrent and IsNext further qualify those setting values. 
 * Note: the referenced SettingData instance does not reflect the current desired state of the referenced ManagedElement unless IsCurrent = "Is Current".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementSettingData#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementSettingData#getSettingData <em>Setting Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementSettingData#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementSettingData#getIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementSettingData#getIsNext <em>Is Next</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.54.1' UMLPackagePath='CIM::Core::Settings' keys='ManagedElement,SettingData'"
 * @generated
 */
@ProviderType
public interface CIM_ElementSettingData extends EObject {
	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The managed element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSettingData_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSettingData#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Setting Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SettingData object that is associated with the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting Data</em>' reference.
	 * @see #setSettingData(CIM_SettingData)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSettingData_SettingData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF' Key='true'"
	 * @generated
	 */
	CIM_SettingData getSettingData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSettingData#getSettingData <em>Setting Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting Data</em>' reference.
	 * @see #getSettingData()
	 * @generated
	 */
	void setSettingData(CIM_SettingData value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer that indicates that the referenced setting is a default setting for the element or that this information is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSettingData_IsDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Is Default\",\"Is Not Default\"]'"
	 * @generated
	 */
	Integer getIsDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSettingData#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer that indicates that the referenced SettingData represents the last requested values for attributes of the Managed Element or that this information is unknown. 
	 * Attributes of the SettingData itself indicate whether it represents the last configuration applied to the ManagedElement or is a transient snapshot of the requested settings. Current operational characteristics of a ManagedElement should be represented with properties of the ManagedElement. element or that this information is unknown. 
	 * For a given ManagedElement and all instances of a SettingData subclass, there shall be at most one instance of ElementSettingData which references the ManagedElement and an instance of the SettingData sub-class where there is a specified non-null, non-key property of the SettingData sub-class, and the IsMaximum property on the referencing ElementSettingData instance has a value of "Is Maximum" or the IsMinimum property on the referencing ElementSettingData instance has a value of "Is Minimum" and the IsCurrent property on the referencing ElementSettingData instance has a value of "Is Current". There shall be at most one instance of ElementSettingData which references a ManagedElement and an instance of a SettingData sub-class where the IsCurrent property has a value of "Is Current" and the IsMinimum property does not have a value of "Is Minimum" and the IsMaximum property does not have a value of "Is Maximum".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Current</em>' attribute.
	 * @see #setIsCurrent(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSettingData_IsCurrent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Is Current\",\"Is Not Current\"]'"
	 * @generated
	 */
	Integer getIsCurrent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSettingData#getIsCurrent <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Current</em>' attribute.
	 * @see #getIsCurrent()
	 * @generated
	 */
	void setIsCurrent(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer indicating whether or not the referenced setting is the next setting to be applied. For example, the application could take place on a re-initialization, reset, reconfiguration request. This could be a permanent setting, or a setting used only one time, as indicated by the flag. If it is a permanent setting then the setting is applied every time the managed element reinitializes, until this flag is manually reset. However, if it is single use, then the flag is automatically cleared after the settings are applied. Also note that if this flag is specified (i.e. set to value other than "Unknown"), then this takes precedence over any SettingData that may have been specified as Default. For example: If the managed element is a computer system, and the value of this flag is "Is Next", then the setting will be effective next time the system resets. And, unless this flag is changed, it will persist for subsequent system resets. However, if this flag is set to "Is Next For Single Use", then this setting will only be used once and the flag would be reset after that to "Is Not Next". So, in the above example, if the system reboots in a quick succession, the setting will not be used at the second reboot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Next</em>' attribute.
	 * @see #setIsNext(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSettingData_IsNext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Is Next\",\"Is Not Next\",\"Is Next For Single Use\"]'"
	 * @generated
	 */
	Integer getIsNext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSettingData#getIsNext <em>Is Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Next</em>' attribute.
	 * @see #getIsNext()
	 * @generated
	 */
	void setIsNext(Integer value);

} // CIM_ElementSettingData
