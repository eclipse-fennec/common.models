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
import org.dmtf.cim.CIM_FileSystemStatisticsManifest;
import org.dmtf.cim.CIM_FileSystemStatisticsManifestCollection;
import org.dmtf.cim.CIM_FileSystemStatisticsService;
import org.dmtf.cim.CIM_StatisticsCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Statistics Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_FileSystemStatisticsServiceImpl extends CIM_StatisticsServiceImpl implements CIM_FileSystemStatisticsService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemStatisticsServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemStatisticsService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetStatisticsCollection(CIM_ConcreteJob Job, EList<Integer> ElementTypes, EList<String> OtherElementTypeDescriptions, CIM_FileSystemStatisticsManifestCollection ManifestCollection, Integer StatisticsFormat, EList<String> Statistics) {
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
	public Long CreateManifestCollection(CIM_StatisticsCollection Statistics, String ElementName, CIM_FileSystemStatisticsManifestCollection ManifestCollection) {
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
	public Long AddOrModifyManifest(CIM_FileSystemStatisticsManifestCollection ManifestCollection, Integer ElementType, String OtherElementTypeDescription, String ElementName, EList<String> StatisticsList, CIM_FileSystemStatisticsManifest Manifest) {
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
	public Long RemoveManifests(CIM_FileSystemStatisticsManifestCollection ManifestCollection, EList<CIM_FileSystemStatisticsManifest> Manifests) {
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
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_SERVICE___GET_STATISTICS_COLLECTION__CIM_CONCRETEJOB_ELIST_ELIST_CIM_FILESYSTEMSTATISTICSMANIFESTCOLLECTION_INTEGER_ELIST:
				return GetStatisticsCollection((CIM_ConcreteJob)arguments.get(0), (EList<Integer>)arguments.get(1), (EList<String>)arguments.get(2), (CIM_FileSystemStatisticsManifestCollection)arguments.get(3), (Integer)arguments.get(4), (EList<String>)arguments.get(5));
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_SERVICE___CREATE_MANIFEST_COLLECTION__CIM_STATISTICSCOLLECTION_STRING_CIM_FILESYSTEMSTATISTICSMANIFESTCOLLECTION:
				return CreateManifestCollection((CIM_StatisticsCollection)arguments.get(0), (String)arguments.get(1), (CIM_FileSystemStatisticsManifestCollection)arguments.get(2));
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_SERVICE___ADD_OR_MODIFY_MANIFEST__CIM_FILESYSTEMSTATISTICSMANIFESTCOLLECTION_INTEGER_STRING_STRING_ELIST_CIM_FILESYSTEMSTATISTICSMANIFEST:
				return AddOrModifyManifest((CIM_FileSystemStatisticsManifestCollection)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (EList<String>)arguments.get(4), (CIM_FileSystemStatisticsManifest)arguments.get(5));
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_SERVICE___REMOVE_MANIFESTS__CIM_FILESYSTEMSTATISTICSMANIFESTCOLLECTION_ELIST:
				return RemoveManifests((CIM_FileSystemStatisticsManifestCollection)arguments.get(0), (EList<CIM_FileSystemStatisticsManifest>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_FileSystemStatisticsServiceImpl
