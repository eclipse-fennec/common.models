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
 * A representation of the model object '<em><b>CIM Users Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The UsersAccess object class is used to specify a 'user' that is permitted access to resources. The ManagedElement that has access to the resources (represented in the model using the ElementAsUser association) may be a person, a service, a service access point or any collection thereof. 
 * 
 * This class is deprecated in lieu of the simpler CIM_Identity abstraction. The UsersAccess class combines credential requirements (in the form of biometric requirements) with the concepts of organizational information (via its position in the inheritance hierarchy), and identity management. These concepts need to be separated to be better understood and managed - hence, the deprecation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UsersAccess#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UsersAccess#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UsersAccess#getElementID <em>Element ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UsersAccess#getBiometric <em>Biometric</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UsersAccess()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_Identity\"]' Version='2.8.0' UMLPackagePath='CIM::User::UsersAccess' keys='CreationClassName,Name,ElementID'"
 * @generated
 */
@ProviderType
public interface CIM_UsersAccess extends CIM_UserEntity {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UsersAccess_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UsersAccess#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name property defines the label by which the object is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UsersAccess_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_Identity.ElementName\"]' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UsersAccess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ElementID property uniquely specifies the ManagedElement object instance that is the user represented by the UsersAccess object instance. The ElementID is formatted similarly to a model path except that the property-value pairs are ordered in alphabetical order (US ASCII lexical order).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element ID</em>' attribute.
	 * @see #setElementID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UsersAccess_ElementID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_Identity.InstanceID\"]' Key='true'"
	 * @generated
	 */
	String getElementID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UsersAccess#getElementID <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' attribute.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(String value);

	/**
	 * Returns the value of the '<em><b>Biometric</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Biometric information used to identify a person. The property value is left null or set to 'N/A' for non-human user or a user not using biometric information for authentication. This property is deprecated as it represents required Credential information and is more correctly modeled as a specific biometric credential.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Biometric</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_UsersAccess_Biometric()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"N/A\",\"Other\",\"Facial\",\"Retina\",\"Mark\",\"Finger\",\"Voice\",\"DNA-RNA\",\"EEG\"]'"
	 * @generated
	 */
	EList<Integer> getBiometric();

} // CIM_UsersAccess
