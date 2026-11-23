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
 * A representation of the model object '<em><b>CIM Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract class defining the common properties of the policy managed elements derived from CIM_Policy. The subclasses are used to create rules and groups of rules that work together to form a coherent set of policies within an administrative domain or set of domains.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Policy#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Policy#getPolicyKeywords <em>Policy Keywords</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Policy()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.6.0' UMLPackagePath='CIM::Policy'"
 * @generated
 */
@ProviderType
public interface CIM_Policy extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Common Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-friendly name of this policy-related object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Name</em>' attribute.
	 * @see #setCommonName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Policy_CommonName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCommonName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Policy#getCommonName <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Name</em>' attribute.
	 * @see #getCommonName()
	 * @generated
	 */
	void setCommonName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of keywords for characterizing / categorizing policy objects. Keywords are of one of two types: 
	 * - Keywords defined in this and other MOFs, or in DMTF white papers. These keywords provide a vendor- independent, installation-independent way of characterizing policy objects. 
	 * - Installation-dependent keywords for characterizing policy objects. Examples include 'Engineering', 'Billing', and 'Review in December 2000'. 
	 * This MOF defines the following keywords: 'UNKNOWN', 'CONFIGURATION', 'USAGE', 'SECURITY', 'SERVICE', 'MOTIVATIONAL', 'INSTALLATION', and 'EVENT'. These concepts are self-explanatory and are further discussed in the SLA/Policy White Paper. One additional keyword is defined: 'POLICY'. The role of this keyword is to identify policy-related instances that may not be otherwise identifiable, in some implementations. The keyword 'POLICY' is NOT mutually exclusive of the other keywords specified above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Keywords</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Policy_PolicyKeywords()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPolicyKeywords();

} // CIM_Policy
