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
 * A representation of the model object '<em><b>CIM Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Role object class is used to represent a position or set of responsibilities within an organization, organizational unit or other scope, and MAY be filled by a person or persons (or non-human entities represented by ManagedSystemElement subclasses) - i.e., the 'role occupants'. The latter MAY be explicitly associated to a Role, by associating Identities using MemberOfCollection. The 'position or set of responsibilities' of a Role are represented as a set of rights defined by instances of the Privilege class, and are also associated to the Role via MemberOfCollection. If Identities are not explicitly associated, instances of AuthorizationRule MUST be associated with a Role using AuthorizationRuleAppliesToRole. The rule defines how subject entities are authorized for a Role and to which target entities the Role applies. 
 * 
 * The Role class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories. This class's properties are a subset of a related class, OtherRoleInformation, which defines all the group properties and uses arrays for directory compatibility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Role#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Role#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Role#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Role#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Role#getRoleCharacteristics <em>Role Characteristics</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Role()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.18.0' UMLPackagePath='CIM::User::Role' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Role extends CIM_Collection {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Role_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Role#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Role_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Business Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property may be used to describe the kind of business activity performed by the members (role occupants) in the position or set of responsibilities represented by the Role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute.
	 * @see #setBusinessCategory(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Role_BusinessCategory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='128'"
	 * @generated
	 */
	String getBusinessCategory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Role#getBusinessCategory <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Category</em>' attribute.
	 * @see #getBusinessCategory()
	 * @generated
	 */
	void setBusinessCategory(String value);

	/**
	 * Returns the value of the '<em><b>Common Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Common Name is a (possibly ambiguous) name by which the role is commonly known in some limited scope (such as an organization) and conforms to the naming conventions of the country or culture with which it is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Name</em>' attribute.
	 * @see #setCommonName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Role_CommonName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getCommonName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Role#getCommonName <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Name</em>' attribute.
	 * @see #getCommonName()
	 * @generated
	 */
	void setCommonName(String value);

	/**
	 * Returns the value of the '<em><b>Role Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RoleCharacteristics provides descriptive information about the intended usage of the Role.
	 * When the value 2 "Static" is specified, no modification to the role shall be allowed. Any requests by client to change the privileges or the scope of the role by modifying the associated instances of CIM_Privilege or referencing associations shall fail.
	 * When the value 2 "Static" is not specified, the instance of CIM_Role may be modified by a client. The modification may include changing the scope of the role or rights granted. When the value 3 "Opaque" is specified, the rights granted by the CIM_Role instance shall not be explicitly modeled through aggregation of instances of CIM_Privilege.
	 * When the value 3 "Opaque" is not specified, the rights granted by the instance of CIM_Role shall be explicitly modeled through aggregation of instances of CIM_Privilege.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Role_RoleCharacteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"32000..65535\"]' Values='[\"Static\",\"Opaque\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getRoleCharacteristics();

} // CIM_Role
