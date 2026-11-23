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
 * A representation of the model object '<em><b>PRS Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Problem is the root object of a set of associated objects that describe a Problem. One or more Problems may be associated with a Solution. 
 * 
 * The Problem is described by PRS_Statement and PRS_Product instances indirectly associated to the PRS_Problem through a PRS_Expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Problem#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Problem#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Problem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Problem extends PRS_SolutionElement {
	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Likelihood describes the potential for the Problem to occur. The value of this property shall be an integer value in the range of 0 to 100, inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see #setLikelihood(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Problem_Likelihood()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='0' MaxValue='100'"
	 * @generated
	 */
	Integer getLikelihood();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Problem#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(Integer value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Impact describes the severity of the problem. The value of this property shall be an integer value in the range of 0 to 100, inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see #setImpact(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Problem_Impact()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='0' MaxValue='100'"
	 * @generated
	 */
	Integer getImpact();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Problem#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(Integer value);

} // PRS_Problem
