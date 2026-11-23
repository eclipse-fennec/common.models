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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM FS Domain Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Identity as known in a specific authentication domain. Currently supported authentication domains are LDAP/Unix and Active Directory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FSDomainIdentity#getPrincipalID <em>Principal ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSDomainIdentity#getDomainType <em>Domain Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FSDomainIdentity#getPrincipalType <em>Principal Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FSDomainIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileSystem' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FSDomainIdentity extends CIM_Identity {
	/**
	 * Returns the value of the '<em><b>Principal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string used by an authentication system to identify a principal during the process of authorization to use a resource. This string is assigned after a successful authentication. For example, after user Joe presents his username and password successfully, the system assigns him the UID 20328, which is what gets presented to a filesystem, say, when Joe attempts to read or write a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal ID</em>' attribute.
	 * @see #setPrincipalID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSDomainIdentity_PrincipalID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPrincipalID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSDomainIdentity#getPrincipalID <em>Principal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal ID</em>' attribute.
	 * @see #getPrincipalID()
	 * @generated
	 */
	void setPrincipalID(String value);

	/**
	 * Returns the value of the '<em><b>Domain Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of domain for which the ID is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Type</em>' attribute.
	 * @see #setDomainType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSDomainIdentity_DomainType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"Unix\",\"Active Directory\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getDomainType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSDomainIdentity#getDomainType <em>Domain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Type</em>' attribute.
	 * @see #getDomainType()
	 * @generated
	 */
	void setDomainType(Integer value);

	/**
	 * Returns the value of the '<em><b>Principal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of principal represented by this Identity instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal Type</em>' attribute.
	 * @see #setPrincipalType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FSDomainIdentity_PrincipalType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"User\",\"Group\",\"Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getPrincipalType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FSDomainIdentity#getPrincipalType <em>Principal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal Type</em>' attribute.
	 * @see #getPrincipalType()
	 * @generated
	 */
	void setPrincipalType(Integer value);

} // CIM_FSDomainIdentity
