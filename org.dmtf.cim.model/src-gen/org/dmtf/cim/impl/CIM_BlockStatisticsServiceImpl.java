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

import org.dmtf.cim.CIM_BlockStatisticsManifest;
import org.dmtf.cim.CIM_BlockStatisticsManifestCollection;
import org.dmtf.cim.CIM_BlockStatisticsService;
import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_StatisticsCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Block Statistics Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_BlockStatisticsServiceImpl extends CIM_StatisticsServiceImpl implements CIM_BlockStatisticsService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BlockStatisticsServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BlockStatisticsService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetStatisticsCollection(CIM_ConcreteJob Job, EList<Integer> ElementTypes, CIM_BlockStatisticsManifestCollection ManifestCollection, Integer StatisticsFormat, EList<String> Statistics) {
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
	public Long CreateManifestCollection(CIM_StatisticsCollection Statistics, String ElementName, CIM_BlockStatisticsManifestCollection ManifestCollection) {
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
	public Long AddOrModifyManifest(CIM_BlockStatisticsManifestCollection ManifestCollection, Integer ElementType, String ElementName, EList<String> StatisticsList, CIM_BlockStatisticsManifest Manifest) {
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
	public Long RemoveManifests(CIM_BlockStatisticsManifestCollection ManifestCollection, EList<CIM_BlockStatisticsManifest> Manifests) {
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
	public Long GetRateStatisticsCollection(CIM_ConcreteJob Job, EList<Integer> RateElementTypes, CIM_BlockStatisticsManifestCollection ManifestCollection, Integer StatisticsFormat, String RateIntervalStartTime, String RateIntervalEndTime, EList<String> Statistics) {
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
			case CimPackage.CIM_BLOCK_STATISTICS_SERVICE___GET_STATISTICS_COLLECTION__CIM_CONCRETEJOB_ELIST_CIM_BLOCKSTATISTICSMANIFESTCOLLECTION_INTEGER_ELIST:
				return GetStatisticsCollection((CIM_ConcreteJob)arguments.get(0), (EList<Integer>)arguments.get(1), (CIM_BlockStatisticsManifestCollection)arguments.get(2), (Integer)arguments.get(3), (EList<String>)arguments.get(4));
			case CimPackage.CIM_BLOCK_STATISTICS_SERVICE___CREATE_MANIFEST_COLLECTION__CIM_STATISTICSCOLLECTION_STRING_CIM_BLOCKSTATISTICSMANIFESTCOLLECTION:
				return CreateManifestCollection((CIM_StatisticsCollection)arguments.get(0), (String)arguments.get(1), (CIM_BlockStatisticsManifestCollection)arguments.get(2));
			case CimPackage.CIM_BLOCK_STATISTICS_SERVICE___ADD_OR_MODIFY_MANIFEST__CIM_BLOCKSTATISTICSMANIFESTCOLLECTION_INTEGER_STRING_ELIST_CIM_BLOCKSTATISTICSMANIFEST:
				return AddOrModifyManifest((CIM_BlockStatisticsManifestCollection)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (EList<String>)arguments.get(3), (CIM_BlockStatisticsManifest)arguments.get(4));
			case CimPackage.CIM_BLOCK_STATISTICS_SERVICE___REMOVE_MANIFESTS__CIM_BLOCKSTATISTICSMANIFESTCOLLECTION_ELIST:
				return RemoveManifests((CIM_BlockStatisticsManifestCollection)arguments.get(0), (EList<CIM_BlockStatisticsManifest>)arguments.get(1));
			case CimPackage.CIM_BLOCK_STATISTICS_SERVICE___GET_RATE_STATISTICS_COLLECTION__CIM_CONCRETEJOB_ELIST_CIM_BLOCKSTATISTICSMANIFESTCOLLECTION_INTEGER_STRING_STRING_ELIST:
				return GetRateStatisticsCollection((CIM_ConcreteJob)arguments.get(0), (EList<Integer>)arguments.get(1), (CIM_BlockStatisticsManifestCollection)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (EList<String>)arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_BlockStatisticsServiceImpl
