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
 * A representation of the model object '<em><b>CIM Policy Role Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicyRoleCollection is used to represent a collection of ManagedElements that share a common policy role, and the PolicySets that CAN BE applied to those elements. (Note that the PolicySets that are CURRENTLY applied are indicated via instances of the association, PolicySetAppliesToElement.) The PolicyRoleCollection always exists in the context of a System, specified using the PolicyRoleCollectionInSystem aggregation. The value of the PolicyRole property in this class specifies the role. It is defined as a free-form string. ManagedElements that share the role defined in this collection are aggregated into the Collection via the ElementInPolicyRoleCollection association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRoleCollection#getPolicyRole <em>Policy Role</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRoleCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyRoleCollection extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Policy Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PolicyRole name for the PolicySets and other ManagedElements that are identified and aggregated by the Collection. Note that the aggregated PolicySets define the rules and groups of rules that may be applied to the associated ManagedElements. 
	 * 
	 * Although not officially designated as 'role combinations', multiple roles may be specified using the form: 
	 * <RoleName>[&&<RoleName>]* 
	 * where the individual role names appear in alphabetical order (according to the collating sequence for UCS-2). Implementations may treat PolicyRole values that are specified as 'role combinations' as simple strings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Role</em>' attribute.
	 * @see #setPolicyRole(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRoleCollection_PolicyRole()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getPolicyRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRoleCollection#getPolicyRole <em>Policy Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Role</em>' attribute.
	 * @see #getPolicyRole()
	 * @generated
	 */
	void setPolicyRole(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activates/applies the PolicySets aggregated into this Collection to the specified ManagedElement. The ManagedElement MUST be a member of the Collection, associated via ElementInPolicyRoleCollection. The result of this method, if it is successfully executed, is that the aggregated PolicySets are deployed and enforced for the Element. This is reflected by the instantiation of the PolicySetAppliesToElement association between the named Element and each PolicySet.
	 * @param Element The ManagedElement to which the aggregated PolicySets of this Collection are applied.
	 * <!-- end-model-doc -->
	 * @model ElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ActivatePolicySet(CIM_ManagedElement Element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deactivates the aggregated PolicySets for the specified ManagedElement. The result of this method, if it is successfully executed, is that the aggregated PolicySets are NOT enforced for the Element. This is reflected by the removal of the PolicySetAppliesToElement association between the named Element and each PolicySet. If a PolicySet is not currently enforced for the ManagedElement, then this method has no effect for that Set.
	 * @param Element The ManagedElement to which the aggregated PolicySets of this Collection MUST NOT apply.
	 * <!-- end-model-doc -->
	 * @model ElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeactivatePolicySet(CIM_ManagedElement Element);

} // CIM_PolicyRoleCollection
