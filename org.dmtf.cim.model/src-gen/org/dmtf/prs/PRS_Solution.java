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
 * A representation of the model object '<em><b>PRS Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Solution is the root class of a set of associated classes used to describe a single Solution. If a Solution is associated with multiple Problems or Resolutions, all of the Problems described are related to all of the Resolutions described. The reverse is also true. All of the Resolutions described are related to all of the Problems described in the Solution. 
 * 
 * PRS_Solution is directly associated to one or more of the following classes: 
 * PRS_Reference 
 * PRS_Problem 
 * PRS_Resolution. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Solution#getTitle <em>Title</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Solution#getSolutionAbstract <em>Solution Abstract</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Solution#getSolutionType <em>Solution Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Solution()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Solution extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Solution title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Solution_Title()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Solution#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Solution Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief description of the Solution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solution Abstract</em>' attribute.
	 * @see #setSolutionAbstract(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Solution_SolutionAbstract()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSolutionAbstract();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Solution#getSolutionAbstract <em>Solution Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Abstract</em>' attribute.
	 * @see #getSolutionAbstract()
	 * @generated
	 */
	void setSolutionAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Solution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SolutionType suggests the type of knowledge contained in the Solution. Depending on the type, the Solution may or may not include particular objects. For example, a 'Reference' Solution describes non-diagnostic technical or general information using PRS_Statement objects. A 'Diagnostic' Solution includes one or more PRS_Problem and PRS_Resolution objects. A 'How To' Solution describes how to solve a particular Problem described by a PRS_Problem in a series of sequential steps within a PRS_Resolution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solution Type</em>' attribute.
	 * @see #setSolutionType(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Solution_SolutionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"254\",\"255\"]' Values='[\"Reference\",\"Diagnostic\",\"How To\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getSolutionType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Solution#getSolutionType <em>Solution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Type</em>' attribute.
	 * @see #getSolutionType()
	 * @generated
	 */
	void setSolutionType(Integer value);

} // PRS_Solution
