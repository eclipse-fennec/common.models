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
package org.dmtf.prs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The agreement or contract referenced for entitlement to service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Agreement#getContractID <em>Contract ID</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Agreement#getAgreementType <em>Agreement Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Agreement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Agreement extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Contract ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the contract between the Request and the Provider. This property is set by the Requester prior to submitting a Service Request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract ID</em>' attribute.
	 * @see #setContractID(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Agreement_ContractID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getContractID();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Agreement#getContractID <em>Contract ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract ID</em>' attribute.
	 * @see #getContractID()
	 * @generated
	 */
	void setContractID(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief description of the contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agreement Type</em>' attribute.
	 * @see #setAgreementType(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Agreement_AgreementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAgreementType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Agreement#getAgreementType <em>Agreement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Type</em>' attribute.
	 * @see #getAgreementType()
	 * @generated
	 */
	void setAgreementType(String value);

} // PRS_Agreement
