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
 * A representation of the model object '<em><b>CIM Credential Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CredentialStore class represents a collection of credentials such as certificates and biometric credentials. Credential collection can be used to store the credentials used by the service for validation of served up credentials or for the owned credentials of the service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CredentialStore#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CredentialStore()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::User::Credential' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CredentialStore extends CIM_Collection {
	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usage of the CIM_CredentialStore. 2 - Owned value means CIM_CredentialStore instance represents a collection of credentials that belong to parties local to the manager of the store. 3 - Trusted value means CIM_CredentialStore instance public credentials that belong to parties trusted by the manager of the store. 4 - Mixed value means CIM_CredentialStore instance represents a collection of both Trusted and Owned credentials.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CredentialStore_Usage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Owned\",\"Trusted\",\"Mixed\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Integer getUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CredentialStore#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(Integer value);

} // CIM_CredentialStore
