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
 * A representation of the model object '<em><b>CIM Named Address Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A NamedAddressCollection groups ProtocolEndpoints/addresses and other network identifiers for the purposes of assigning a single name (i.e., an alias). It is a subclass of SystemSpecificCollection to force the definition of the 'named collection' in the context of a System (for example, either a ComputerSystem or an AdminDomain hosting a naming alias).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NamedAddressCollection#getCollectionAlias <em>Collection Alias</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NamedAddressCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NamedAddressCollection extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Collection Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name (alias) for the NamedAddressCollection which is unique in the context of the hosting System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection Alias</em>' attribute.
	 * @see #setCollectionAlias(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NamedAddressCollection_CollectionAlias()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' Write='true'"
	 * @generated
	 */
	String getCollectionAlias();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NamedAddressCollection#getCollectionAlias <em>Collection Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Alias</em>' attribute.
	 * @see #getCollectionAlias()
	 * @generated
	 */
	void setCollectionAlias(String value);

} // CIM_NamedAddressCollection
