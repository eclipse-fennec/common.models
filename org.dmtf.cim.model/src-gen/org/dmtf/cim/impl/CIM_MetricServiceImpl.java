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
package org.dmtf.cim.impl;

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_BaseMetricDefinition;
import org.dmtf.cim.CIM_BaseMetricValue;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_MetricService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Metric Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_MetricServiceImpl extends CIM_ServiceImpl implements CIM_MetricService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MetricServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MetricService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ShowMetrics(CIM_ManagedElement Subject, CIM_BaseMetricDefinition Definition, EList<CIM_ManagedElement> ManagedElements, EList<CIM_BaseMetricDefinition> DefinitionList, EList<String> MetricNames, EList<Integer> MetricCollectionEnabled) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ShowMetricsByClass(CIM_ManagedElement Subject, CIM_BaseMetricDefinition Definition, EList<CIM_BaseMetricDefinition> DefinitionList, EList<String> MetricNames, EList<Integer> MetricCollectionEnabled) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ControlMetrics(CIM_ManagedElement Subject, CIM_BaseMetricDefinition Definition, Integer MetricCollectionEnabled) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ControlMetricsByClass(CIM_ManagedElement Subject, CIM_BaseMetricDefinition Definition, Integer MetricCollectionEnabled) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetMetricValues(CIM_BaseMetricDefinition Definition, Integer Range, Integer Count, EList<CIM_BaseMetricValue> Values) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ControlSampleTimes(String StartSampleTime, String PreferredSampleInterval, Boolean RestartGathering) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_METRIC_SERVICE___SHOW_METRICS__CIM_MANAGEDELEMENT_CIM_BASEMETRICDEFINITION_ELIST_ELIST_ELIST_ELIST:
				return ShowMetrics((CIM_ManagedElement)arguments.get(0), (CIM_BaseMetricDefinition)arguments.get(1), (EList<CIM_ManagedElement>)arguments.get(2), (EList<CIM_BaseMetricDefinition>)arguments.get(3), (EList<String>)arguments.get(4), (EList<Integer>)arguments.get(5));
			case CimPackage.CIM_METRIC_SERVICE___SHOW_METRICS_BY_CLASS__CIM_MANAGEDELEMENT_CIM_BASEMETRICDEFINITION_ELIST_ELIST_ELIST:
				return ShowMetricsByClass((CIM_ManagedElement)arguments.get(0), (CIM_BaseMetricDefinition)arguments.get(1), (EList<CIM_BaseMetricDefinition>)arguments.get(2), (EList<String>)arguments.get(3), (EList<Integer>)arguments.get(4));
			case CimPackage.CIM_METRIC_SERVICE___CONTROL_METRICS__CIM_MANAGEDELEMENT_CIM_BASEMETRICDEFINITION_INTEGER:
				return ControlMetrics((CIM_ManagedElement)arguments.get(0), (CIM_BaseMetricDefinition)arguments.get(1), (Integer)arguments.get(2));
			case CimPackage.CIM_METRIC_SERVICE___CONTROL_METRICS_BY_CLASS__CIM_MANAGEDELEMENT_CIM_BASEMETRICDEFINITION_INTEGER:
				return ControlMetricsByClass((CIM_ManagedElement)arguments.get(0), (CIM_BaseMetricDefinition)arguments.get(1), (Integer)arguments.get(2));
			case CimPackage.CIM_METRIC_SERVICE___GET_METRIC_VALUES__CIM_BASEMETRICDEFINITION_INTEGER_INTEGER_ELIST:
				return GetMetricValues((CIM_BaseMetricDefinition)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (EList<CIM_BaseMetricValue>)arguments.get(3));
			case CimPackage.CIM_METRIC_SERVICE___CONTROL_SAMPLE_TIMES__STRING_STRING_BOOLEAN:
				return ControlSampleTimes((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_MetricServiceImpl
