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
 * A representation of the model object '<em><b>CIM Chip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Chip class represents any type of integrated circuit hardware, including ASICs, processors, memory chips, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Chip#getFormFactor <em>Form Factor</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Chip()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Physical::Component' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_Chip extends CIM_PhysicalComponent {
	/**
	 * Returns the value of the '<em><b>Form Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The implementation form factor for the Chip. For example, values such as SIMM (7), TSOP (9) or PGA (10) can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Factor</em>' attribute.
	 * @see #setFormFactor(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Chip_FormFactor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\"]' Values='[\"Unknown\",\"Other\",\"SIP\",\"DIP\",\"ZIP\",\"SOJ\",\"Proprietary\",\"SIMM\",\"DIMM\",\"TSOP\",\"PGA\",\"RIMM\",\"SODIMM\",\"SRIMM\",\"SMD\",\"SSMP\",\"QFP\",\"TQFP\",\"SOIC\",\"LCC\",\"PLCC\",\"BGA\",\"FPBGA\",\"LGA\",\"Die\"]'"
	 * @generated
	 */
	Integer getFormFactor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Chip#getFormFactor <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Factor</em>' attribute.
	 * @see #getFormFactor()
	 * @generated
	 */
	void setFormFactor(Integer value);

} // CIM_Chip
