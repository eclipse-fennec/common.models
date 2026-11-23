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
 * A representation of the model object '<em><b>CIM Associated Supply Current Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The use of this association is being deprecated in lieu of using AssociatedSensor, since the use of the referenced class CurrentSensor is deprecated. 
 * A PowerSupply may have an associated CurrentSensor, monitoring its input frequency. This is described by this association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedSupplyCurrentSensor#getMonitoringRange <em>Monitoring Range</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedSupplyCurrentSensor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AssociatedSensor\"]' Version='2.8.0' UMLPackagePath='CIM::Device::Sensors' override.Antecedent='CIM_CurrentSensor REF' override.Antecedent.Deprecated='[\"CIM_AssociatedSensor.Antecedent\"]' override.Antecedent.Description='The CurrentSensor.' override.Dependent='CIM_PowerSupply REF' override.Dependent.Deprecated='[\"CIM_AssociatedSensor.Dependent\"]' override.Dependent.Description='The PowerSupply associated with the CurrentSensor.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedSupplyCurrentSensor extends CIM_AssociatedSensor {
	/**
	 * Returns the value of the '<em><b>Monitoring Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the PowerSupply's input frequency range measured by the associated sensor. Range 1, 2 or both can be specified using the values 2, 3 or 4, respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitoring Range</em>' attribute.
	 * @see #setMonitoringRange(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedSupplyCurrentSensor_MonitoringRange()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Range 1\",\"Range 2\",\"Both Range 1 and 2\"]'"
	 * @generated
	 */
	Integer getMonitoringRange();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedSupplyCurrentSensor#getMonitoringRange <em>Monitoring Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Range</em>' attribute.
	 * @see #getMonitoringRange()
	 * @generated
	 */
	void setMonitoringRange(Integer value);

} // CIM_AssociatedSupplyCurrentSensor
