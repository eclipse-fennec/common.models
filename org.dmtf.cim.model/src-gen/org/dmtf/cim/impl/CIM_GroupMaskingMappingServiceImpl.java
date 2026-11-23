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
import org.dmtf.cim.CIM_GroupMaskingMappingService;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_MaskingGroup;
import org.dmtf.cim.CIM_SCSIProtocolController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Group Masking Mapping Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_GroupMaskingMappingServiceImpl extends CIM_ControllerConfigurationServiceImpl implements CIM_GroupMaskingMappingService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_GroupMaskingMappingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_GroupMaskingMappingService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateGroup(String GroupName, Integer Type, EList<CIM_ManagedElement> Members, CIM_ConcreteJob Job, Boolean DeleteOnEmpty, Boolean DeleteWhenBecomesUnassociated, Boolean ConsistentLogicalUnitNumber, CIM_MaskingGroup MaskingGroup) {
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
	public Long DeleteGroup(CIM_MaskingGroup MaskingGroup, CIM_ConcreteJob Job, Boolean Force) {
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
	public Long AddMembers(CIM_MaskingGroup MaskingGroup, EList<CIM_ManagedElement> Members, EList<String> DeviceNumbers, CIM_ConcreteJob Job) {
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
	public Long RemoveMembers(CIM_MaskingGroup MaskingGroup, EList<CIM_ManagedElement> Members, CIM_ConcreteJob Job, Boolean DeleteOnEmpty) {
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
	public Long CreateMaskingView(String ElementName, CIM_MaskingGroup InitiatorMaskingGroup, CIM_MaskingGroup TargetMaskingGroup, CIM_MaskingGroup DeviceMaskingGroup, EList<String> DeviceNumbers, CIM_ConcreteJob Job, CIM_SCSIProtocolController ProtocolController) {
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
	public Long DeleteMaskingView(CIM_SCSIProtocolController ProtocolController, CIM_ConcreteJob Job, Boolean DeleteWhenBecomesUnassociated) {
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
	public Long ModifyMaskingView(Integer Operation, CIM_SCSIProtocolController ProtocolController, CIM_MaskingGroup MaskingGroup, EList<String> DeviceNumbers, CIM_ConcreteJob Job, Boolean Force) {
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
			case CimPackage.CIM_GROUP_MASKING_MAPPING_SERVICE___CREATE_GROUP__STRING_INTEGER_ELIST_CIM_CONCRETEJOB_BOOLEAN_BOOLEAN_BOOLEAN_CIM_MASKINGGROUP:
				return CreateGroup((String)arguments.get(0), (Integer)arguments.get(1), (EList<CIM_ManagedElement>)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (Boolean)arguments.get(4), (Boolean)arguments.get(5), (Boolean)arguments.get(6), (CIM_MaskingGroup)arguments.get(7));
			case CimPackage.CIM_GROUP_MASKING_MAPPING_SERVICE___DELETE_GROUP__CIM_MASKINGGROUP_CIM_CONCRETEJOB_BOOLEAN:
				return DeleteGroup((CIM_MaskingGroup)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (Boolean)arguments.get(2));
			case CimPackage.CIM_GROUP_MASKING_MAPPING_SERVICE___ADD_MEMBERS__CIM_MASKINGGROUP_ELIST_ELIST_CIM_CONCRETEJOB:
				return AddMembers((CIM_MaskingGroup)arguments.get(0), (EList<CIM_ManagedElement>)arguments.get(1), (EList<String>)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_GROUP_MASKING_MAPPING_SERVICE___REMOVE_MEMBERS__CIM_MASKINGGROUP_ELIST_CIM_CONCRETEJOB_BOOLEAN:
				return RemoveMembers((CIM_MaskingGroup)arguments.get(0), (EList<CIM_ManagedElement>)arguments.get(1), (CIM_ConcreteJob)arguments.get(2), (Boolean)arguments.get(3));
			case CimPackage.CIM_GROUP_MASKING_MAPPING_SERVICE___CREATE_MASKING_VIEW__STRING_CIM_MASKINGGROUP_CIM_MASKINGGROUP_CIM_MASKINGGROUP_ELIST_CIM_CONCRETEJOB_CIM_SCSIPROTOCOLCONTROLLER:
				return CreateMaskingView((String)arguments.get(0), (CIM_MaskingGroup)arguments.get(1), (CIM_MaskingGroup)arguments.get(2), (CIM_MaskingGroup)arguments.get(3), (EList<String>)arguments.get(4), (CIM_ConcreteJob)arguments.get(5), (CIM_SCSIProtocolController)arguments.get(6));
			case CimPackage.CIM_GROUP_MASKING_MAPPING_SERVICE___DELETE_MASKING_VIEW__CIM_SCSIPROTOCOLCONTROLLER_CIM_CONCRETEJOB_BOOLEAN:
				return DeleteMaskingView((CIM_SCSIProtocolController)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (Boolean)arguments.get(2));
			case CimPackage.CIM_GROUP_MASKING_MAPPING_SERVICE___MODIFY_MASKING_VIEW__INTEGER_CIM_SCSIPROTOCOLCONTROLLER_CIM_MASKINGGROUP_ELIST_CIM_CONCRETEJOB_BOOLEAN:
				return ModifyMaskingView((Integer)arguments.get(0), (CIM_SCSIProtocolController)arguments.get(1), (CIM_MaskingGroup)arguments.get(2), (EList<String>)arguments.get(3), (CIM_ConcreteJob)arguments.get(4), (Boolean)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_GroupMaskingMappingServiceImpl
