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
 * A representation of the model object '<em><b>CIM Other Group Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OtherGroupInformation class provides additional information about an associated Group instance. This class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherGroupInformation#getSeeAlso <em>See Also</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::User::Group' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OtherGroupInformation extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherGroupInformation#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * The Name property defines the label by which the object is known. In the case of an LDAP-derived instance, the Name property value may be set to the distinguished name of the LDAP-accessed object instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherGroupInformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the ObjectClass property value(s) may be set to the objectClass attribute values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_ObjectClass()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getObjectClass();

	/**
	 * Returns the value of the '<em><b>Business Category</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BusinessCategory property may be used to describe the kind of business activity performed by the members of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_BusinessCategory()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getBusinessCategory();

	/**
	 * Returns the value of the '<em><b>Common Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Common Name is a (possibly ambiguous) name by which the group is commonly known in some limited scope (such as an organization) and conforms to the naming conventions of the country or culture with which it is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_CommonName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCommonName();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Descriptions property values may contain human-readable descriptions of the object. In the case of an LDAP-derived instance, the description attribute may have multiple values that, therefore, cannot be placed in the inherited Description property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_Descriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='1024'"
	 * @generated
	 */
	EList<String> getDescriptions();

	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an organization related to the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_OrganizationName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOrganizationName();

	/**
	 * Returns the value of the '<em><b>OU</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an organizational unit related to the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OU</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_OU()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOU();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Owner property specifies the name of some object that has some responsibility for the group. In the case of an LDAP-derived instance, a property value for Owner may be a distinguished name of owning persons, groups, roles, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_Owner()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOwner();

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the SeeAlso property specifies distinguished name of other Directory objects which may be other aspects (in some sense) of the same real world object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>See Also</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherGroupInformation_SeeAlso()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSeeAlso();

} // CIM_OtherGroupInformation
