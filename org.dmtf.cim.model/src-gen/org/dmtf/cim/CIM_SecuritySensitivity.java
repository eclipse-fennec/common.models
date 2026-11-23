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
 * A representation of the model object '<em><b>CIM Security Sensitivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this class defines a security label used to characterize the security clearance necessary to access information in a system that supports mandatory access controls. The labels have two components, one a hierarchical security level and the other a set of non-hierarchical security categories. 
 * 
 * Mandatory access control determines whether to allow certain actions, based on the following rules: - If the security level of a security principal is equal to or greater than the security level of an element, and the security categories the security principal include all of the security categories of the element, then the security principal may read from the element. - If the security label of a security principal is equal to or less than the security label of an element, and the security categories the element include all of the security categories of the security principal, then the security principal may write to the element.
 * 
 * An element is assigned a security level via the association, ElementSecurityLevel. It can be assigned to any ManagedElement, such as Locations, Identities, Roles, Systems, Services and LogicalFiles. 
 * 
 * The clearance of a security principal, represented by an instance of Identity may be specified by associating an instance of this class via IdentitySecurityClearance.
 * 
 * The set of security levels and categories are determined by a business, organization and/or government based on the need to protect data and entities from attack, loss, abuse or unauthorized disclosure, and the ramifications if this protection is not maintained.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SecuritySensitivity#getSecurityLevel <em>Security Level</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SecuritySensitivity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::User::SecurityLevel' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. For DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SecuritySensitivity extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string defining the security sensitivity level. Since individual organizations each may have their own classification systems, the value of this property should include sufficient information to assure that the value is unambiguous. The value of SecurityLevel should be constructed using the following 'preferred' algorithm:
	 * <OrgID>:[<ClassificationScheme>:]<LevelName> 
	 * Where <OrgID> and <ClassificationScheme> and <LevelName> are each separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business or government entity creating/defining the classification scheme or is a registered ID that is assigned to the business or government entity by a recognized global authority. In addition, to ensure uniqueness both <OrgID> and <ClassificationScheme> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in SecurityLevel MUST appear between <OrgID> and <ClassificationScheme> and the second colon to appear in SecurityLevel MUST appear between <ClassificationScheme> and <LevelName>. 
	 * <ClassificationName> is chosen by the business or government entity and SHOULD not be re-used to identify classification schemes. Each classification scheme defines one or more LevelNames that are unique within the classification scheme. An organization may choose to not use a classification scheme. In that case, each <LevelName> must not contain a colon (':') and must be unique within the organization.
	 * Examples: 'Buffalo.edu:Public', 'Buffalo.edu:Internal Use', 'Buffalo.edu:Confidential', 'Buffalo.edu:Restricted Confidential', 'NSI:Confidential', 'NSI:Secret', and 'NSI: Top Secret'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Level</em>' attribute.
	 * @see #setSecurityLevel(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SecuritySensitivity_SecurityLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSecurityLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SecuritySensitivity#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' attribute.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(String value);

} // CIM_SecuritySensitivity
