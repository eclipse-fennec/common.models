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

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_OperationalPowerManifest;
import org.dmtf.cim.CIM_OperationalPowerManifestCollection;
import org.dmtf.cim.CIM_OperationalPowerStatisticsService;
import org.dmtf.cim.CIM_StatisticsCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Operational Power Statistics Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_OperationalPowerStatisticsServiceImpl extends CIM_StatisticsServiceImpl implements CIM_OperationalPowerStatisticsService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OperationalPowerStatisticsServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OperationalPowerStatisticsService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetStatisticsCollection(CIM_ConcreteJob Job, EList<Integer> ElementTypes, CIM_OperationalPowerManifestCollection ManifestCollection, Integer StatisticsFormat, EList<String> Statistics) {
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
	public Long CreateManifestCollection(CIM_StatisticsCollection Statistics, String ElementName, CIM_OperationalPowerManifestCollection ManifestCollection) {
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
	public Long AddOrModifyManifest(CIM_OperationalPowerManifestCollection ManifestCollection, Integer ElementType, String ElementName, EList<String> StatisticsList, CIM_OperationalPowerManifest Manifest) {
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
	public Long RemoveManifests(CIM_OperationalPowerManifestCollection ManifestCollection, EList<CIM_OperationalPowerManifest> Manifests) {
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
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_SERVICE___GET_STATISTICS_COLLECTION__CIM_CONCRETEJOB_ELIST_CIM_OPERATIONALPOWERMANIFESTCOLLECTION_INTEGER_ELIST:
				return GetStatisticsCollection((CIM_ConcreteJob)arguments.get(0), (EList<Integer>)arguments.get(1), (CIM_OperationalPowerManifestCollection)arguments.get(2), (Integer)arguments.get(3), (EList<String>)arguments.get(4));
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_SERVICE___CREATE_MANIFEST_COLLECTION__CIM_STATISTICSCOLLECTION_STRING_CIM_OPERATIONALPOWERMANIFESTCOLLECTION:
				return CreateManifestCollection((CIM_StatisticsCollection)arguments.get(0), (String)arguments.get(1), (CIM_OperationalPowerManifestCollection)arguments.get(2));
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_SERVICE___ADD_OR_MODIFY_MANIFEST__CIM_OPERATIONALPOWERMANIFESTCOLLECTION_INTEGER_STRING_ELIST_CIM_OPERATIONALPOWERMANIFEST:
				return AddOrModifyManifest((CIM_OperationalPowerManifestCollection)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (EList<String>)arguments.get(3), (CIM_OperationalPowerManifest)arguments.get(4));
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_SERVICE___REMOVE_MANIFESTS__CIM_OPERATIONALPOWERMANIFESTCOLLECTION_ELIST:
				return RemoveManifests((CIM_OperationalPowerManifestCollection)arguments.get(0), (EList<CIM_OperationalPowerManifest>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_OperationalPowerStatisticsServiceImpl
