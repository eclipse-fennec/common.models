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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Policy Set Applies To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicySetAppliesToElement makes explicit which PolicySets (i.e., policy rules and groups of rules) ARE CURRENTLY applied to a particular Element. This association indicates that the PolicySets that are appropriate for a ManagedElement (specified using the PolicyRoleCollection aggregation) have actually been deployed in the policy management infrastructure. Note that if the named Element refers to a Collection, then the PolicySet is assumed to be applied to all the members of the Collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PolicySetAppliesToElement#getPolicySet <em>Policy Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicySetAppliesToElement#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicySetAppliesToElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Policy' keys='PolicySet,ManagedElement'"
 * @generated
 */
@ProviderType
public interface CIM_PolicySetAppliesToElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PolicyRules and/or groups of rules that are currently applied to an Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Set</em>' reference.
	 * @see #setPolicySet(CIM_PolicySet)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicySetAppliesToElement_PolicySet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PolicySet REF' Key='true'"
	 * @generated
	 */
	CIM_PolicySet getPolicySet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicySetAppliesToElement#getPolicySet <em>Policy Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Set</em>' reference.
	 * @see #getPolicySet()
	 * @generated
	 */
	void setPolicySet(CIM_PolicySet value);

	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement to which the PolicySet applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicySetAppliesToElement_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicySetAppliesToElement#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

} // CIM_PolicySetAppliesToElement
