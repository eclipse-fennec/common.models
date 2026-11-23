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
 * A representation of the model object '<em><b>CIM Collection Of MS Es</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CollectionOfMSEs object allows the grouping of Managed SystemElements for various identification purposes and to reduce the complexity of associating Settings and Configurations. It is abstract to require further definition and semantic refinement in subclasses. The CollectionOfMSEs object does not carry any state or status information, but represents only a grouping or 'bag' of Elements. For this reason, it is incorrect to subclass groups that have state or status from CollectionOfMSEs. An example is CIM_Redundancy Group (which is subclassed from LogicalElement). 
 * Collections typically aggregate similar ('like') objects,but they are not required to do so. Collections simply identify 'bags' and might represent an optimization. This purpose is especially true with respect to their association to Settings and Configurations. Without Collections, you would need to define individual ElementSetting and ElementConfiguration associations, to tie Settings and Configuration objects to individual ManagedSystemElements. There might be duplication when assigning the same Setting to multiple objects. In addition, using the Collection object allows the determination that the Setting and Configuration associations are indeed the same for the Collection's members. This information would otherwise be obtained by defining the Collection in a proprietary manner, and then querying the ElementSetting and ElementConfiguration associations to determine if the Collection set is completely covered.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CollectionOfMSEs#getCollectionID <em>Collection ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectionOfMSEs()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.10.0' UMLPackagePath='CIM::Core::Collection'"
 * @generated
 */
@ProviderType
public interface CIM_CollectionOfMSEs extends CIM_Collection {
	/**
	 * Returns the value of the '<em><b>Collection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identification of the Collection object. When subclassed, the CollectionID property can be overridden to be a Key property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection ID</em>' attribute.
	 * @see #setCollectionID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectionOfMSEs_CollectionID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getCollectionID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectionOfMSEs#getCollectionID <em>Collection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection ID</em>' attribute.
	 * @see #getCollectionID()
	 * @generated
	 */
	void setCollectionID(String value);

} // CIM_CollectionOfMSEs
