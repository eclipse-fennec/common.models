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
 * A representation of the model object '<em><b>CIM Filter Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FilterCollection is a subclass of CIM_Collection which aggregates instances of CIM_IndicationFilter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FilterCollection#getCollectionName <em>Collection Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilterCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.20.0' UMLPackagePath='CIM::Event' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID shall be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FilterCollection extends CIM_Collection {
	/**
	 * Returns the value of the '<em><b>Collection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Collection Name is to be specified by a profile or owning organization such that it can be used to identify a particular collection of indication filters. The value of CollectionName shall be constructed using the following algorithm: 
	 * <OrgID>:<CollectionID> 
	 * Where <OrgID> and <CollectionID> are separated by a colon ':', and where <OrgID> shall include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the CollectionName. In addition, to ensure uniqueness <OrgID> shall not contain a colon (':').
	 * <CollectionID> is the string label defined in the specification defining the collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection Name</em>' attribute.
	 * @see #setCollectionName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterCollection_CollectionName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCollectionName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterCollection#getCollectionName <em>Collection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Name</em>' attribute.
	 * @see #getCollectionName()
	 * @generated
	 */
	void setCollectionName(String value);

} // CIM_FilterCollection
