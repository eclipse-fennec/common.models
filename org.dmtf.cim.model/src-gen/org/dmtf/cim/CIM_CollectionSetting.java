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
 * A representation of the model object '<em><b>CIM Collection Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CollectionSetting represents the association between a CollectionOfMSEs class and the Setting classes that are defined for it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CollectionSetting#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CollectionSetting#getSetting <em>Setting</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectionSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' keys='Collection,Setting'"
 * @generated
 */
@ProviderType
public interface CIM_CollectionSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CollectionOfMSEs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(CIM_CollectionOfMSEs)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectionSetting_Collection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CollectionOfMSEs REF' Key='true'"
	 * @generated
	 */
	CIM_CollectionOfMSEs getCollection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectionSetting#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CIM_CollectionOfMSEs value);

	/**
	 * Returns the value of the '<em><b>Setting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Setting object that is associated with the Collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' reference.
	 * @see #setSetting(CIM_Setting)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectionSetting_Setting()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Setting REF' Key='true'"
	 * @generated
	 */
	CIM_Setting getSetting();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectionSetting#getSetting <em>Setting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' reference.
	 * @see #getSetting()
	 * @generated
	 */
	void setSetting(CIM_Setting value);

} // CIM_CollectionSetting
