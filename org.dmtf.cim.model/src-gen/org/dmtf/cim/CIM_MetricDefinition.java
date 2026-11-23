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
 * A representation of the model object '<em><b>CIM Metric Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The metrics that are associated with a UnitOfWork. These metrics usually describe some aspect of a UnitOfWork such as how much work was done, or the size of the UnitOfWork. For example, the size of a print job or the number of pages printed could be metrics of a 'print' UnitOfWork.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MetricDefinition#getValidity <em>Validity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MetricDefinition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Id='string' override.Id.Description='A 16 byte value that uniquely identifies the Metric Definition. The use of OSF UUID/GUIDs is recommended.' override.Id.MaxLen='16' keys='Id'"
 * @generated
 */
@ProviderType
public interface CIM_MetricDefinition extends CIM_BaseMetricDefinition {
	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value describing when the Metric may be considered valid. Some metrics are valid only at the beginning of a transaction (e.g., bytes to print), while the transaction is running (e.g., percent complete), or when the transaction is finished (e.g., pages printed). If a metric is valid at more than one of the enumerated values, such as both when the unit of work starts and when it stops, it is recommended to not use Validity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MetricDefinition_Validity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"At Start\",\"In Middle\",\"At Stop\"]'"
	 * @generated
	 */
	Integer getValidity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MetricDefinition#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(Integer value);

} // CIM_MetricDefinition
