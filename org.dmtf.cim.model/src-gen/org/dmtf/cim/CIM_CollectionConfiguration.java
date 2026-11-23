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
 * A representation of the model object '<em><b>CIM Collection Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The Configuration class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of instances of Setting or SettingData. This relationship allows the reuse of the collection-to-Setting and element-to-SettingData associations instead of defining peer associations specifically for Configurations. 
 * Deprecated description: This association relates a Configuration object to one or more CollectionOfMSEs objects. The Configuration object represents a certain behavior or a desired functional state for the associated Collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CollectionConfiguration#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CollectionConfiguration#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectionConfiguration()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ElementSettingData\",\"CIM_CollectionSetting\"]' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='Collection,Configuration'"
 * @generated
 */
@ProviderType
public interface CIM_CollectionConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The CollectionOfMSEs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(CIM_CollectionOfMSEs)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectionConfiguration_Collection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CollectionOfMSEs REF' Deprecated='[\"CIM_ElementSettingData.ManagedElement\",\"CIM_CollectionSetting.Collection\"]' Key='true'"
	 * @generated
	 */
	CIM_CollectionOfMSEs getCollection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectionConfiguration#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CIM_CollectionOfMSEs value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this element is deprecated. Deprecated description: The Configuration object that groups the Settings and dependencies that are associated with the Collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(CIM_Configuration)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectionConfiguration_Configuration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Configuration REF' Deprecated='[\"CIM_ElementSettingData.SettingData\",\"CIM_CollectionSetting.Setting\"]' Key='true'"
	 * @generated
	 */
	CIM_Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectionConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(CIM_Configuration value);

} // CIM_CollectionConfiguration
