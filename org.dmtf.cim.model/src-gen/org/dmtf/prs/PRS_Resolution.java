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
 * A representation of the model object '<em><b>PRS Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Resolution is the root object of a set of associated objects that describe a the resolution to a Problem. One or more Resolutions may be associated with a Solution. 
 * 
 * The Resolution is described by PRS_Statement and PRS_Product instances indirectly associated to the PRS_Resolution through a PRS_Expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Resolution#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Resolution()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Resolution extends PRS_SolutionElement {
	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Confidence describes the potential for the Resolution to correct the Problem or Problems associated with the PRS_Solution. The value of this property shall be an integer value in the range of 0 to 100, inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Resolution_Confidence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='0' MaxValue='100'"
	 * @generated
	 */
	Integer getConfidence();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Resolution#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(Integer value);

} // PRS_Resolution
